package com.luosheng.test;

public enum TableFieldEnum {
    GraphType("datav_graph", "graph_type", "type", "图表类型"),
    BoardType("datav_board", "board_type", "type", "看板类型");

    private String table;
    private String field;
    private String property;
    private String description;

    private TableFieldEnum(String table, String field, String property, String description) {
        this.table = table;
        this.field = field;
        this.property = property;
        this.description = description;
    }

    public String getTable() {
        return table;
    }

    public String getField() {
        return field;
    }

    public String getProperty() {
        return property;
    }

    public String getDescription() {
        return description;
    }
    
    public static void main(String[] args) {
        String property = TableFieldEnum.GraphType.getProperty();
        System.out.println(property);
    }
    
}
