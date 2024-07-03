package org.example.ejercicio4;

public class ExerciseDatabase {
    public class Database {
        public void save(String data){
            //Lógica para guardar datos en la base de datos
        }

        public Database() {
        }
    }


    public class Dataservice{
        private Database database = new Database();

        public void saveData(String data){
            database.save(data);
        }
    }
}
