package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.AbstractC5103e1;

/* renamed from: com.android.billingclient.api.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1057e {

    /* renamed from: a, reason: collision with root package name */
    private int f12435a;

    /* renamed from: b, reason: collision with root package name */
    private String f12436b;

    /* renamed from: com.android.billingclient.api.e$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f12437a;

        /* renamed from: b, reason: collision with root package name */
        private String f12438b = "";

        /* synthetic */ a(E1.x xVar) {
        }

        public C1057e a() {
            C1057e c1057e = new C1057e();
            c1057e.f12435a = this.f12437a;
            c1057e.f12436b = this.f12438b;
            return c1057e;
        }

        public a b(String str) {
            this.f12438b = str;
            return this;
        }

        public a c(int i8) {
            this.f12437a = i8;
            return this;
        }
    }

    public static a c() {
        return new a(null);
    }

    public String a() {
        return this.f12436b;
    }

    public int b() {
        return this.f12435a;
    }

    public String toString() {
        return "Response Code: " + AbstractC5103e1.g(this.f12435a) + ", Debug Message: " + this.f12436b;
    }
}
