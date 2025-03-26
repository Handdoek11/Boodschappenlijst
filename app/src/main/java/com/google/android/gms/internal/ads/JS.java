package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.RemoteException;
import i3.BinderC5853b;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class JS extends AbstractC1336Gd0 {

    /* renamed from: o, reason: collision with root package name */
    private final Context f16250o;

    /* renamed from: s, reason: collision with root package name */
    private final InterfaceExecutorServiceC3522nk0 f16251s;

    public JS(Context context, InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0) {
        super(context, "AdMobOfflineBufferedPings.db", null, ((Integer) D2.A.c().a(AbstractC3184kf.l8)).intValue(), AbstractC1444Jd0.f16281a);
        this.f16250o = context;
        this.f16251s = interfaceExecutorServiceC3522nk0;
    }

    static /* synthetic */ Void e(H2.u uVar, SQLiteDatabase sQLiteDatabase) {
        m(sQLiteDatabase, uVar);
        return null;
    }

    static /* synthetic */ void i(SQLiteDatabase sQLiteDatabase, String str, H2.u uVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", (Integer) 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        m(sQLiteDatabase, uVar);
    }

    static final void l(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    private static void m(SQLiteDatabase sQLiteDatabase, H2.u uVar) {
        String str;
        sQLiteDatabase.beginTransaction();
        try {
            Cursor query = sQLiteDatabase.query("offline_buffered_pings", new String[]{"timestamp", "url"}, "event_state = 1", null, null, null, "timestamp ASC", null);
            int count = query.getCount();
            String[] strArr = new String[count];
            int i8 = 0;
            while (query.moveToNext()) {
                int columnIndex = query.getColumnIndex("timestamp");
                int columnIndex2 = query.getColumnIndex("url");
                if (columnIndex2 != -1) {
                    long j8 = query.getLong(columnIndex);
                    String string = query.getString(columnIndex2);
                    if (string == null) {
                        str = "";
                    } else {
                        Uri parse = Uri.parse(string);
                        long a8 = C2.v.c().a() - j8;
                        String encodedQuery = parse.getEncodedQuery();
                        Uri.Builder clearQuery = parse.buildUpon().clearQuery();
                        clearQuery.appendQueryParameter("bd", Long.toString(a8));
                        str = String.valueOf(clearQuery.build()) + "&" + encodedQuery;
                    }
                    strArr[i8] = str;
                }
                i8++;
            }
            query.close();
            sQLiteDatabase.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            for (int i9 = 0; i9 < count; i9++) {
                uVar.n(strArr[i9]);
            }
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }

    final /* synthetic */ Void d(LS ls, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(ls.f16833a));
        contentValues.put("gws_query_id", ls.f16834b);
        contentValues.put("url", ls.f16835c);
        contentValues.put("event_state", Integer.valueOf(ls.f16836d - 1));
        sQLiteDatabase.insert("offline_buffered_pings", null, contentValues);
        C2.v.t();
        G2.T a8 = G2.D0.a(this.f16250o);
        if (a8 != null) {
            try {
                a8.zze(BinderC5853b.p2(this.f16250o));
            } catch (RemoteException e8) {
                AbstractC0608p0.l("Failed to schedule offline ping sender.", e8);
            }
        }
        return null;
    }

    public final void f(final String str) {
        h(new InterfaceC4333v80(this) { // from class: com.google.android.gms.internal.ads.HS
            @Override // com.google.android.gms.internal.ads.InterfaceC4333v80
            public final Object a(Object obj) {
                JS.l((SQLiteDatabase) obj, str);
                return null;
            }
        });
    }

    public final void g(final LS ls) {
        h(new InterfaceC4333v80() { // from class: com.google.android.gms.internal.ads.DS
            @Override // com.google.android.gms.internal.ads.InterfaceC4333v80
            public final Object a(Object obj) {
                this.f14494a.d(ls, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    final void h(InterfaceC4333v80 interfaceC4333v80) {
        AbstractC2326ck0.r(this.f16251s.p0(new Callable() { // from class: com.google.android.gms.internal.ads.FS
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f15162o.getWritableDatabase();
            }
        }), new IS(this, interfaceC4333v80), this.f16251s);
    }

    final void j(final SQLiteDatabase sQLiteDatabase, final H2.u uVar, final String str) {
        this.f16251s.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.GS
            @Override // java.lang.Runnable
            public final void run() {
                JS.i(sQLiteDatabase, str, uVar);
            }
        });
    }

    public final void k(final H2.u uVar, final String str) {
        h(new InterfaceC4333v80() { // from class: com.google.android.gms.internal.ads.ES
            @Override // com.google.android.gms.internal.ads.InterfaceC4333v80
            public final Object a(Object obj) {
                this.f14735a.j((SQLiteDatabase) obj, uVar, str);
                return null;
            }
        });
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i8, int i9) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i8, int i9) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }
}
