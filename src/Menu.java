class Menu {

    String name;
    String desc;

    public Menu(){}
    public Menu(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "  " + name + "  " + desc;
    }



}
