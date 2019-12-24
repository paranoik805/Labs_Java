package bsu.rfe.java.group9.lab3.Yurkevich;

import javax.swing.table.AbstractTableModel;

@SuppressWarnings("serial")
public class GornerTableModel extends AbstractTableModel
{
    private Double[] coefficients;
    private Double from;
    private Double to;
    private Double step;

    GornerTableModel(Double from, Double to, Double step, Double[] coefficients)
    {
        this.from = from;
        this.to = to;
        this.step = step;
        this.coefficients = coefficients;
    }

    Double getFrom()
    {
        return from;
    }

    Double getTo()
    {
        return to;
    }

    Double getStep()
    {
        return step;
    }

    public int getColumnCount()
    {
        // В данной модели два столбца
        return 3;
    }

    public int getRowCount()
    {
        // Вычислить количество точек между началом и концом отрезка
        // исходя из шага табулирования
        return new Double(Math.ceil((to - from) / step)).intValue() + 1;
    }

    public Object getValueAt(int row, int col)
    {
        // Вычислить значение X как НАЧАЛО_ОТРЕЗКА + ШАГ*НОМЕР_СТРОКИ
        double x = from + step*row;
        if (col == 0)
        {
            // Если запрашивается значение 1-го столбца, то это X
            return x;
        } else {
            // Если запрашивается значение 2-го столбца, то это значение
            // многочлена
            double result = coefficients[0];
            for (int i = 1; i < coefficients.length; i++)
            {
                result = result * x + coefficients[i];
            }
            if (col == 1){
                return result;
            }
            else {
                return result >= 0.0;
            }

        }

    }

    public String getColumnName(int col)
    {
        switch (col) {
            case 0:
                // Название 1-го столбца
                return "Значение X";
            case 1:
                // Название 2-го столбца
                return "Значение многочлена";
            default:
                // Название 3-го столбца
                return "Значение больше нуля?";
        }
    }

    public Class<?> getColumnClass(int col)
    {
        switch (col) {
            case 0:
            case 1:
                // И в 1-ом и во 2-ом столбце находятся значения типа Double
                return Double.class;
            default:
                // В 3-ем столбце находятся значения типа Boolean
                return Boolean.class;
        }
    }
}