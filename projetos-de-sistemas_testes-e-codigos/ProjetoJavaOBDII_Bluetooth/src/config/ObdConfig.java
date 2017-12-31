package config;

import obd.commands.ObdCommand;
import obd.commands.SpeedCommand;
import obd.commands.control.DistanceMILOnCommand;
import obd.commands.control.DtcNumberCommand;
import obd.commands.control.EquivalentRatioCommand;
import obd.commands.control.ModuleVoltageCommand;
import obd.commands.control.TimingAdvanceCommand;
import obd.commands.control.TroubleCodesCommand;
import obd.commands.control.VinCommand;
import obd.commands.engine.LoadCommand;
import obd.commands.engine.MassAirFlowCommand;
import obd.commands.engine.OilTempCommand;
import obd.commands.engine.RPMCommand;
import obd.commands.engine.RuntimeCommand;
import obd.commands.engine.ThrottlePositionCommand;
import obd.commands.fuel.AirFuelRatioCommand;
import obd.commands.fuel.ConsumptionRateCommand;
import obd.commands.fuel.FindFuelTypeCommand;
import obd.commands.fuel.FuelLevelCommand;
import obd.commands.fuel.FuelTrimCommand;
import obd.commands.fuel.WidebandAirFuelRatioCommand;
import obd.commands.pressure.BarometricPressureCommand;
import obd.commands.pressure.FuelPressureCommand;
import obd.commands.pressure.FuelRailPressureCommand;
import obd.commands.pressure.IntakeManifoldPressureCommand;
import obd.commands.temperature.AirIntakeTemperatureCommand;
import obd.commands.temperature.AmbientAirTemperatureCommand;
import obd.commands.temperature.EngineCoolantTemperatureCommand;
import obd.enums.FuelTrim;

import java.util.ArrayList;

/**
 * TODO put description
 */
public final class ObdConfig {

    public static ArrayList<ObdCommand> getCommands() {
        ArrayList<ObdCommand> cmds = new ArrayList<>();

        // Control
        cmds.add(new ModuleVoltageCommand());
        cmds.add(new EquivalentRatioCommand());
        cmds.add(new DistanceMILOnCommand());
        cmds.add(new DtcNumberCommand());
        cmds.add(new TimingAdvanceCommand());
        cmds.add(new TroubleCodesCommand());
        cmds.add(new VinCommand());

        // Engine
        cmds.add(new LoadCommand());
        cmds.add(new RPMCommand());
        cmds.add(new RuntimeCommand());
        cmds.add(new MassAirFlowCommand());
        cmds.add(new ThrottlePositionCommand());

        // Fuel
        cmds.add(new FindFuelTypeCommand());
        cmds.add(new ConsumptionRateCommand());
        // cmds.add(new AverageFuelEconomyObdCommand());
        //cmds.add(new FuelEconomyCommand());
        cmds.add(new FuelLevelCommand());
        // cmds.add(new FuelEconomyMAPObdCommand());
        // cmds.add(new FuelEconomyCommandedMAPObdCommand());
        cmds.add(new FuelTrimCommand(FuelTrim.LONG_TERM_BANK_1));
        cmds.add(new FuelTrimCommand(FuelTrim.LONG_TERM_BANK_2));
        cmds.add(new FuelTrimCommand(FuelTrim.SHORT_TERM_BANK_1));
        cmds.add(new FuelTrimCommand(FuelTrim.SHORT_TERM_BANK_2));
        cmds.add(new AirFuelRatioCommand());
        cmds.add(new WidebandAirFuelRatioCommand());
        cmds.add(new OilTempCommand());

        // Pressure
        cmds.add(new BarometricPressureCommand());
        cmds.add(new FuelPressureCommand());
        cmds.add(new FuelRailPressureCommand());
        cmds.add(new IntakeManifoldPressureCommand());

        // Temperature
        cmds.add(new AirIntakeTemperatureCommand());
        cmds.add(new AmbientAirTemperatureCommand());
        cmds.add(new EngineCoolantTemperatureCommand());

        // Misc
        cmds.add(new SpeedCommand());


        return cmds;
    }

}
