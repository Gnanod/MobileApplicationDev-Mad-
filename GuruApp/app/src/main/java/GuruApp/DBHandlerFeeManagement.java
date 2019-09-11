package GuruApp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHandlerFeeManagement extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "GuruApp.db";

    public DBHandlerFeeManagement(Context context){
        super(context, DATABASE_NAME, null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String SQL_CREATE_ENTRIES =
                "CREATE TABLE " + Fee.FeeDetail.TABLE_NAME + " ("+
                        Fee.FeeDetail.COLUMN_NAME_STUDENTID + " Text," +
                        Fee.FeeDetail.COLUMN_NAME_STUDENTNAME + " Text," +
                        Fee.FeeDetail.COLUMN_NAME_MONTH + " Text," +
                        Fee.FeeDetail.COLUMN_NAME_AMOUNT + " Text," +
                        Fee.FeeDetail.COLUMN_NAME_TYPE + " Text)";

        db.execSQL(SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
