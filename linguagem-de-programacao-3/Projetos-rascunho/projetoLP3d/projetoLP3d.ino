int sensor = 0;
int led = 13;
void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
  pinMode(led, OUTPUT);
  //delay(1000);
  //Serial.println("Serial iniciada com sucesso");
}

void loop() {
  // put your main code here, to run repeatedly:
    float temperatura = (analogRead(sensor)*0.00488)*100;
    Serial.println(temperatura);
    
    
    if(Serial.available() > 0){
      char menu = Serial.read();
      
      if(menu == 'a'){
        digitalWrite(led, HIGH);
      }
      if(menu == 'b'){
        digitalWrite(led, LOW);
      }
    }
    
    

    //delay(100);
    //char recebido = Serial.read();
      //Serial.print("Temperatura: ");
      
      //delay(1000);
    
  
}
