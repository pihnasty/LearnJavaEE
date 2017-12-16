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


    public enum ColumnNameMonitoring {
        ID("id","id"),
        NAME_OPERATION("nameOperation","Наименование технологической операции"),
        STATUS_PACKLOGS("statusPacklogs","Состояние межоперационных заделов"),
        PLAN_CAPACITY("planCamacity","Плановая производительность"),
        ACTUAL_CAPACITY("actualCapacity","Фактическая производительность"),
        PERFOMANCE_DEVIATION("perfomanceDeviation","Откланение производительности"),
        PREPAREDNESS_RATE_PLAN("preparednessRatePlan","Процент выполненного заказа по плану"),
        PREPAREDNESS_RATE_FACT("preparednessRateFact","Процент выполненного заказа по факту"),
        PERFORMANCE_ABERRANT("performanceAberrant","Отклонение выполнения"),
        NUMBER("","№№");
        private String name;
        private String description;

        ColumnNameMonitoring(String name, String description) {
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
