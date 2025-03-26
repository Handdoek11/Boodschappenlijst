package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.measurement.AbstractC5010r4;
import com.google.android.gms.internal.measurement.C4961l2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5389p {

    /* renamed from: a, reason: collision with root package name */
    private final String f31137a;

    /* renamed from: b, reason: collision with root package name */
    private long f31138b = -1;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ C5354k f31139c;

    public C5389p(C5354k c5354k, String str) {
        this.f31139c = c5354k;
        Z2.r.f(str);
        this.f31137a = str;
    }

    public final List a() {
        Cursor query;
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                query = this.f31139c.z().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", "data", "realtime"}, "app_id = ? and rowid > ?", new String[]{this.f31137a, String.valueOf(this.f31138b)}, null, null, "rowid", "1000");
            } catch (SQLiteException e8) {
                this.f31139c.h().E().c("Data loss. Error querying raw events batch. appId", C5378n2.t(this.f31137a), e8);
                if (0 != 0) {
                    cursor.close();
                }
            }
            if (!query.moveToFirst()) {
                List emptyList = Collections.emptyList();
                query.close();
                return emptyList;
            }
            do {
                long j8 = query.getLong(0);
                long j9 = query.getLong(3);
                boolean z7 = query.getLong(5) == 1;
                byte[] blob = query.getBlob(4);
                if (j8 > this.f31138b) {
                    this.f31138b = j8;
                }
                try {
                    C4961l2.a aVar = (C4961l2.a) Z5.E(C4961l2.S(), blob);
                    String string = query.getString(1);
                    if (string == null) {
                        string = "";
                    }
                    aVar.G(string).I(query.getLong(2));
                    arrayList.add(new C5375n(j8, j9, z7, (C4961l2) ((AbstractC5010r4) aVar.u())));
                } catch (IOException e9) {
                    this.f31139c.h().E().c("Data loss. Failed to merge raw event. appId", C5378n2.t(this.f31137a), e9);
                }
            } while (query.moveToNext());
            query.close();
            return arrayList;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }
}
