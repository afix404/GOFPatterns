package org.example.Builder;

public class Pizza {


    private final String sous;
    private final String razmer;
    private final String osnova;
    private final String sir;
    private final String extra;


    private Pizza(Builder builder) {
      this.extra = builder.extra;
      this.sir = builder.sir;
      this.osnova = builder.osnova;
      this.razmer = builder.razmer;
      this.sous = builder.sous;
    }

    public static class Builder{
        private  String sous;
        private  String razmer;
        private  String osnova;
        private  String sir;
        private  String extra;

        public Builder(String osnova, String razmer) {
            this.osnova = osnova;
            this.razmer = razmer;
        }

        public Builder setSous(String sous){
            this.sous = sous;
            return this;
        }

        public Builder setExtra(String extra){
            this.extra = extra;
            return this;
        }

        public Builder setSir(String sir){
            this.sir = sir;
            return this;
        }

        public Pizza build(){
            return new Pizza(this);
        }

        public static Builder getPizzaBuilder(String osnova, String razmer){
            return new Builder(osnova, razmer);
        }
    }

    public void showInfo(){
        System.out.println(osnova);
        System.out.println(razmer);
        System.out.println(extra);
        System.out.println(sous);
        System.out.println(sir);
    }


}
