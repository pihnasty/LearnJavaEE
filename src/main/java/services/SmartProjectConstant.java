package services;

public class SmartProjectConstant {

    public enum ColumnNameTechnologicalProcess {
        ID("id","id"),
        NAME_OPERATION("nameOperation","Наименование технологической операции"),
        PERFORMANCE("performance","Производительность, шт./смена"),
        EQUIPMENT("equipment","Модель оборудования"),
        SEQUENCE("sequence","Номер выполнения технологической операции"),
        IMAGE("image","Фото оборудования"),
        NUMBER("","№№");

        private String name;
        private String description;

        ColumnNameTechnologicalProcess(String name, String description) {
            this.name = name;
            this.description=description;
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }

        public String toString() {
            return name;
        }
    }

}
