package com.example.ruan.agendademanutencaoautomotiva.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;

import com.example.ruan.agendademanutencaoautomotiva.models.LembreteManutencao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

/**
 * Created by Ruan on 17/11/2017.
 */

public class DBHelper {
    private static final String DATABASE_NAME = "lembretes_manutencao.db";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_NAME = "tabela_lembrete";

    private Context context;
    private SQLiteDatabase db;

    private SQLiteStatement insertStmt, deleteStmt, updateStmt, updateRealizadoStmt;
    private static final String INSERT = "insert into "+TABLE_NAME+" (data_agendamento, horario_agendamento, notas, valor, realizado) values (?, ?, ?, ?, ?)";
    private static final String DELETE = "delete from "+TABLE_NAME+" where id = ?";
    private static final String UPDATE = "update "+TABLE_NAME+" set data_agendamento = ?, horario_agendamento = ?, notas = ?, valor = ? where id = ?";
    private static final String UPDATE_REALIZADO = "update "+TABLE_NAME+" set realizado = ? where id = ?";

    public DBHelper(Context context){
        this.context = context;
        OpenHelper openHelper = new OpenHelper(this.context);
        this.db = openHelper.getWritableDatabase();
        this.insertStmt = this.db.compileStatement(INSERT);
        this.deleteStmt = this.db.compileStatement(DELETE);
        this.updateStmt = this.db.compileStatement(UPDATE);
        this.updateRealizadoStmt = this.db.compileStatement(UPDATE_REALIZADO);
    }

    public long insert(LembreteManutencao lembreteManutencao){
        this.insertStmt.bindString(1,lembreteManutencao.getDataAgendamento());
        this.insertStmt.bindString(2,lembreteManutencao.getHorarioAgendamento());
        this.insertStmt.bindString(3, lembreteManutencao.getNotas());
        this.insertStmt.bindDouble(4, lembreteManutencao.getValor());
        this.insertStmt.bindLong(5, lembreteManutencao.isRealizado());
        return this.insertStmt.executeInsert();
    }

    public int delete(LembreteManutencao lembreteManutencao){
        this.deleteStmt.bindLong(1,lembreteManutencao.getId());
        return this.deleteStmt.executeUpdateDelete();
    }

    public void update(LembreteManutencao lembreteManutencao){
        this.updateStmt.bindString(1,lembreteManutencao.getDataAgendamento());
        this.updateStmt.bindString(2,lembreteManutencao.getHorarioAgendamento());
        this.updateStmt.bindString(3, lembreteManutencao.getNotas());
        this.updateStmt.bindDouble(4, lembreteManutencao.getValor());
        this.updateStmt.bindLong(5,lembreteManutencao.getId());
        this.updateStmt.execute();
    }

    public void updateRealizado(LembreteManutencao lembreteManutencao){
        this.updateRealizadoStmt.bindLong(1,lembreteManutencao.isRealizado());
        this.updateRealizadoStmt.bindLong(2,lembreteManutencao.getId());
        this.updateRealizadoStmt.execute();
    }

    public void deleteAll(){
        this.db.delete(TABLE_NAME, null, null);
    }

    public List<LembreteManutencao> queryGetAll(){
        List<LembreteManutencao> list = new ArrayList<LembreteManutencao>();
        try {
            Cursor cursor = this.db.query(TABLE_NAME, new String[]{"id", "data_agendamento", "horario_agendamento", "notas", "valor", "realizado"},
                    null, null, null, null, null, null);
            int nregistros = cursor.getCount();

            if (nregistros != 0){
                cursor.moveToFirst();
                do {
                    LembreteManutencao lembreteManutencao = new LembreteManutencao();
                    lembreteManutencao.setId(cursor.getLong(0));
                    lembreteManutencao.setDataAgendamento(cursor.getString(1));
                    lembreteManutencao.setHorarioAgendamento(cursor.getString(2));
                    lembreteManutencao.setNotas(cursor.getString(3));
                    lembreteManutencao.setValor(cursor.getDouble(4));
                    lembreteManutencao.setRealizado(cursor.getLong(5));

                    list.add(lembreteManutencao);
                }while (cursor.moveToNext());

                if (cursor != null && !cursor.isClosed()){
                    cursor.close();
                }
                return list;
            }else {
                return null;
            }
        }catch (Exception err){
            return null;
        }

    }

    private static class OpenHelper extends SQLiteOpenHelper{
        OpenHelper(Context context){
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            String sql = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME +
                    " (id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "data_agendamento TEXT, " +
                    "horario_agendamento TEXT, " +
                    "notas TEXT, " +
                    "valor DOUBLE, " +
                    "realizado BOOLEAN);";
            db.execSQL(sql);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
            onCreate(db);
        }
    }
}
