package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.AbstractC5010r4;
import com.google.android.gms.internal.measurement.C4961l2;
import com.google.android.gms.internal.measurement.C4977n2;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
final class m6 {

    /* renamed from: a, reason: collision with root package name */
    private C4961l2 f31092a;

    /* renamed from: b, reason: collision with root package name */
    private Long f31093b;

    /* renamed from: c, reason: collision with root package name */
    private long f31094c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ h6 f31095d;

    final C4961l2 a(String str, C4961l2 c4961l2) {
        Object obj;
        String U7 = c4961l2.U();
        List V7 = c4961l2.V();
        this.f31095d.m();
        Long l8 = (Long) Z5.d0(c4961l2, "_eid");
        boolean z7 = l8 != null;
        if (z7 && U7.equals("_ep")) {
            Z2.r.l(l8);
            this.f31095d.m();
            U7 = (String) Z5.d0(c4961l2, "_en");
            if (TextUtils.isEmpty(U7)) {
                this.f31095d.h().G().b("Extra parameter without an event name. eventId", l8);
                return null;
            }
            if (this.f31092a == null || this.f31093b == null || l8.longValue() != this.f31093b.longValue()) {
                Pair F7 = this.f31095d.o().F(str, l8);
                if (F7 == null || (obj = F7.first) == null) {
                    this.f31095d.h().G().c("Extra parameter without existing main event. eventName, eventId", U7, l8);
                    return null;
                }
                this.f31092a = (C4961l2) obj;
                this.f31094c = ((Long) F7.second).longValue();
                this.f31095d.m();
                this.f31093b = (Long) Z5.d0(this.f31092a, "_eid");
            }
            long j8 = this.f31094c - 1;
            this.f31094c = j8;
            if (j8 <= 0) {
                C5354k o8 = this.f31095d.o();
                o8.l();
                o8.h().I().b("Clearing complex main event info. appId", str);
                try {
                    o8.z().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                } catch (SQLiteException e8) {
                    o8.h().E().b("Error clearing complex main event", e8);
                }
            } else {
                this.f31095d.o().l0(str, l8, this.f31094c, this.f31092a);
            }
            ArrayList arrayList = new ArrayList();
            for (C4977n2 c4977n2 : this.f31092a.V()) {
                this.f31095d.m();
                if (Z5.D(c4961l2, c4977n2.W()) == null) {
                    arrayList.add(c4977n2);
                }
            }
            if (arrayList.isEmpty()) {
                this.f31095d.h().G().b("No unique parameters in main event. eventName", U7);
            } else {
                arrayList.addAll(V7);
                V7 = arrayList;
            }
        } else if (z7) {
            this.f31093b = l8;
            this.f31092a = c4961l2;
            this.f31095d.m();
            long longValue = ((Long) Z5.H(c4961l2, "_epc", 0L)).longValue();
            this.f31094c = longValue;
            if (longValue <= 0) {
                this.f31095d.h().G().b("Complex event with zero extra param count. eventName", U7);
            } else {
                this.f31095d.o().l0(str, (Long) Z2.r.l(l8), this.f31094c, c4961l2);
            }
        }
        return (C4961l2) ((AbstractC5010r4) ((C4961l2.a) c4961l2.y()).G(U7).L().F(V7).u());
    }

    private m6(h6 h6Var) {
        this.f31095d = h6Var;
    }
}
