package androidx.work.impl.background.systemalarm;

import A1.p;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import s1.j;
import w1.C6868d;

/* loaded from: classes.dex */
class c {

    /* renamed from: e, reason: collision with root package name */
    private static final String f11857e = j.f("ConstraintsCmdHandler");

    /* renamed from: a, reason: collision with root package name */
    private final Context f11858a;

    /* renamed from: b, reason: collision with root package name */
    private final int f11859b;

    /* renamed from: c, reason: collision with root package name */
    private final e f11860c;

    /* renamed from: d, reason: collision with root package name */
    private final C6868d f11861d;

    c(Context context, int i8, e eVar) {
        this.f11858a = context;
        this.f11859b = i8;
        this.f11860c = eVar;
        this.f11861d = new C6868d(context, eVar.f(), null);
    }

    void a() {
        List<p> g8 = this.f11860c.g().o().B().g();
        ConstraintProxy.a(this.f11858a, g8);
        this.f11861d.d(g8);
        ArrayList arrayList = new ArrayList(g8.size());
        long currentTimeMillis = System.currentTimeMillis();
        for (p pVar : g8) {
            String str = pVar.f95a;
            if (currentTimeMillis >= pVar.a() && (!pVar.b() || this.f11861d.c(str))) {
                arrayList.add(pVar);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = ((p) it.next()).f95a;
            Intent b8 = b.b(this.f11858a, str2);
            j.c().a(f11857e, String.format("Creating a delay_met command for workSpec with id (%s)", str2), new Throwable[0]);
            e eVar = this.f11860c;
            eVar.k(new e.b(eVar, b8, this.f11859b));
        }
        this.f11861d.e();
    }
}
