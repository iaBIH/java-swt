package com.example;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;


import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Window {

    public static void main(String[] args) {


        System.out.println(System.getProperty("java.class.path"));

        Display display = new Display();
        final Shell shell = new Shell(display);

        // Get the size of the primary monitor
        Rectangle monitorBounds = display.getPrimaryMonitor().getBounds();
        Point monitorSize = new Point(monitorBounds.width, monitorBounds.height);

        // Center the shell on the monitor
        shell.setLocation(monitorSize.x/2 - 100, monitorSize.y/2 - 150);

        shell.setSize(200, 300);
        shell.setText("Example Window");

        // Create a button widget
        org.eclipse.swt.widgets.Button button = new org.eclipse.swt.widgets.Button(shell, SWT.PUSH);
        button.setBounds(50, 100, 100, 30);
        button.setText("Click Me!");
        button.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                shell.setText("it works");
            }
        });
        shell.open();
        while (!shell.isDisposed()) {
            if (!display.readAndDispatch())
                display.sleep();
        }
        display.dispose();
    }

}
