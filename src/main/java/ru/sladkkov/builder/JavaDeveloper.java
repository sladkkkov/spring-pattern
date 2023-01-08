package ru.sladkkov.builder;

public class JavaDeveloper {
    private String name;
    private int size;
    private int weight;

    public JavaDeveloper(JavaDeveloperBuilder javaDeveloperBuilder) {
        this.name = javaDeveloperBuilder.name;
        this.size = javaDeveloperBuilder.size;
        this.weight = javaDeveloperBuilder.weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    public static class JavaDeveloperBuilder {

        private String name;
        private int size;
        private int weight;

        public JavaDeveloperBuilder size(int size) {
            this.size = size;
            return this;
        }

        public JavaDeveloperBuilder name(String name) {
            this.name = name;
            return this;
        }

        public JavaDeveloperBuilder weight(int weight) {
            this.weight = weight;
            return this;
        }

        public JavaDeveloper build() {
            return new JavaDeveloper(this);
        }
    }
}
