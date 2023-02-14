package turtleCenter;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventObject;

import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.event.CellEditorListener;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

public class ButtonRenderer extends JButton implements TableCellRenderer, TableCellEditor, ActionListener {
  private static final long serialVersionUID = 1L;

  public ButtonRenderer() {
    super();
    setOpaque(true);
    addActionListener(this);
  }

  @Override
  public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
    setText((value == null) ? "" : value.toString());
    return this;
  }

  @Override
  public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
    setText((value == null) ? "" : value.toString());
    return this;
  }

  @Override
  public Object getCellEditorValue() {
    return getText();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    // codice da eseguire quando il pulsante viene cliccato
  }

@Override
public boolean isCellEditable(EventObject anEvent) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean shouldSelectCell(EventObject anEvent) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean stopCellEditing() {
	// TODO Auto-generated method stub
	return false;
}

@Override
public void cancelCellEditing() {
	// TODO Auto-generated method stub
	
}

@Override
public void addCellEditorListener(CellEditorListener l) {
	// TODO Auto-generated method stub
	
}

@Override
public void removeCellEditorListener(CellEditorListener l) {
	// TODO Auto-generated method stub
	
}
}

