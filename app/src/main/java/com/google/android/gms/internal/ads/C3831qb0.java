package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Date;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.qb0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3831qb0 implements InterfaceC4157tb0 {

    /* renamed from: e, reason: collision with root package name */
    private static final C3831qb0 f25954e = new C3831qb0(new C4266ub0());

    /* renamed from: a, reason: collision with root package name */
    private Date f25955a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f25956b;

    /* renamed from: c, reason: collision with root package name */
    private final C4266ub0 f25957c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f25958d;

    private C3831qb0(C4266ub0 c4266ub0) {
        this.f25957c = c4266ub0;
    }

    public static C3831qb0 b() {
        return f25954e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4157tb0
    public final void a(boolean z7) {
        if (!this.f25958d && z7) {
            Date date = new Date();
            Date date2 = this.f25955a;
            if (date2 == null || date.after(date2)) {
                this.f25955a = date;
                if (this.f25956b) {
                    Iterator it = C4048sb0.a().b().iterator();
                    while (it.hasNext()) {
                        ((C2200bb0) it.next()).g().g(c());
                    }
                }
            }
        }
        this.f25958d = z7;
    }

    public final Date c() {
        Date date = this.f25955a;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public final void d(Context context) {
        if (this.f25956b) {
            return;
        }
        this.f25957c.d(context);
        this.f25957c.e(this);
        this.f25957c.f();
        this.f25958d = this.f25957c.f27082s;
        this.f25956b = true;
    }
}
