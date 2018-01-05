int sensor = 0;
int led = 13;
void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
  pinMode(led, OUTPUT);
  delay(1000);
  Serial.println("Serial iniciada com sucesso");
}

void loop() {
  // put your main code here, to run repeatedly:
    float temperatura = (analogRead(sensor)*0.00488)*100;
    if(temperatura > 27){
      digitalWrite(led, HIGH);
    }else{
      digitalWrite(led, LOW);
    }

    //delay(100);
    //char recebido = Serial.read();
      Serial.print("Temperatura: ");
      Serial.println(temperatura);
      delay(1000);
    
  
}
