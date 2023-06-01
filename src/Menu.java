class Menu {

    protected String name;
    protected String desc;

    public Menu(){}
    public Menu(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return this.name;
    }

    public String getDesc() {
        return this.desc;
    }

    @Override
    public String toString() {
        return "  " + this.name + "  " + this.desc;
    }



}
