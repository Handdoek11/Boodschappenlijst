package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.vS, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4364vS {

    /* renamed from: a, reason: collision with root package name */
    private final C2000Zc f27260a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f27261b;

    /* renamed from: c, reason: collision with root package name */
    private final C2080aS f27262c;

    /* renamed from: d, reason: collision with root package name */
    private final H2.a f27263d;

    public C4364vS(Context context, H2.a aVar, C2000Zc c2000Zc, C2080aS c2080aS) {
        this.f27261b = context;
        this.f27263d = aVar;
        this.f27260a = c2000Zc;
        this.f27262c = c2080aS;
    }

    final /* synthetic */ Void a(boolean z7, SQLiteDatabase sQLiteDatabase) {
        if (z7) {
            this.f27261b.deleteDatabase("OfflineUpload.db");
        } else {
            ArrayList arrayList = new ArrayList();
            Cursor query = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
            while (query.moveToNext()) {
                try {
                    arrayList.add(C4051sd.G0(query.getBlob(query.getColumnIndexOrThrow("serialized_proto_data"))));
                } catch (zzgyg e8) {
                    H2.p.d("Unable to deserialize proto from offline signals database:");
                    H2.p.d(e8.getMessage());
                }
            }
            query.close();
            Context context = this.f27261b;
            C4269ud s02 = C4596xd.s0();
            s02.H(context.getPackageName());
            s02.J(Build.MODEL);
            s02.C(AbstractC3711pS.a(sQLiteDatabase, 0));
            s02.G(arrayList);
            s02.E(AbstractC3711pS.a(sQLiteDatabase, 1));
            s02.I(AbstractC3711pS.a(sQLiteDatabase, 3));
            s02.F(C2.v.c().a());
            s02.D(AbstractC3711pS.b(sQLiteDatabase, 2));
            final C4596xd c4596xd = (C4596xd) s02.x();
            int size = arrayList.size();
            long j8 = 0;
            for (int i8 = 0; i8 < size; i8++) {
                C4051sd c4051sd = (C4051sd) arrayList.get(i8);
                if (c4051sd.D0() == EnumC1337Ge.ENUM_TRUE && c4051sd.C0() > j8) {
                    j8 = c4051sd.C0();
                }
            }
            if (j8 != 0) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("value", Long.valueOf(j8));
                sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
            }
            this.f27260a.b(new InterfaceC1965Yc() { // from class: com.google.android.gms.internal.ads.tS
                @Override // com.google.android.gms.internal.ads.InterfaceC1965Yc
                public final void a(C1409Ie c1409Ie) {
                    c1409Ie.G(c4596xd);
                }
            });
            H2.a aVar = this.f27263d;
            C1407Id h02 = C1443Jd.h0();
            h02.C(aVar.f2915s);
            h02.E(this.f27263d.f2916t);
            h02.D(true != this.f27263d.f2917u ? 2 : 0);
            final C1443Jd c1443Jd = (C1443Jd) h02.x();
            this.f27260a.b(new InterfaceC1965Yc() { // from class: com.google.android.gms.internal.ads.uS
                @Override // com.google.android.gms.internal.ads.InterfaceC1965Yc
                public final void a(C1409Ie c1409Ie) {
                    C1121Ae c1121Ae = (C1121Ae) c1409Ie.K().H();
                    c1121Ae.D(c1443Jd);
                    c1409Ie.E(c1121Ae);
                }
            });
            this.f27260a.c(10004);
            AbstractC3711pS.e(sQLiteDatabase);
        }
        return null;
    }

    public final void b(final boolean z7) {
        try {
            this.f27262c.a(new InterfaceC4333v80() { // from class: com.google.android.gms.internal.ads.sS
                @Override // com.google.android.gms.internal.ads.InterfaceC4333v80
                public final Object a(Object obj) {
                    this.f26663a.a(z7, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e8) {
            H2.p.d("Error in offline signals database startup: ".concat(String.valueOf(e8.getMessage())));
        }
    }
}
