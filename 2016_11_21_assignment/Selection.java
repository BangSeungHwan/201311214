package com.sm.ch8;

class Selection {

    Selection(){}

    public void select(Rectangle r) {
        r.setSelected(true);
        System.out.println("selected: "+r.isSelected);
    }

    public static void main(String[] args) {
		Selection s = new Selection();
		Rectangle r = new Rectangle(20,30);
		s.select(r);
		r.getSelected();
    }

}