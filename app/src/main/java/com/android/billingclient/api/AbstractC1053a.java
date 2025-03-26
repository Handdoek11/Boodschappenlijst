package com.android.billingclient.api;

import E1.C0561a;
import E1.C0565e;
import E1.C0567g;
import E1.InterfaceC0562b;
import E1.InterfaceC0563c;
import E1.InterfaceC0564d;
import E1.InterfaceC0566f;
import E1.InterfaceC0568h;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.play_billing.AbstractC5103e1;

/* renamed from: com.android.billingclient.api.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1053a {

    /* renamed from: com.android.billingclient.api.a$a, reason: collision with other inner class name */
    public static final class C0215a {

        /* renamed from: a, reason: collision with root package name */
        private volatile C1058f f12377a;

        /* renamed from: b, reason: collision with root package name */
        private final Context f12378b;

        /* renamed from: c, reason: collision with root package name */
        private volatile E1.j f12379c;

        /* renamed from: d, reason: collision with root package name */
        private volatile boolean f12380d;

        /* renamed from: e, reason: collision with root package name */
        private volatile boolean f12381e;

        /* synthetic */ C0215a(Context context, E1.H h8) {
            this.f12378b = context;
        }

        private final boolean d() {
            try {
                return this.f12378b.getPackageManager().getApplicationInfo(this.f12378b.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
            } catch (Exception e8) {
                AbstractC5103e1.k("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e8);
                return false;
            }
        }

        public AbstractC1053a a() {
            if (this.f12378b == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            }
            if (this.f12379c == null) {
                if (!this.f12380d && !this.f12381e) {
                    throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
                }
                Context context = this.f12378b;
                return d() ? new E(null, context, null, null) : new C1054b(null, context, null, null);
            }
            if (this.f12377a == null || !this.f12377a.a()) {
                throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
            if (this.f12379c == null) {
                C1058f c1058f = this.f12377a;
                Context context2 = this.f12378b;
                return d() ? new E(null, c1058f, context2, null, null, null) : new C1054b(null, c1058f, context2, null, null, null);
            }
            C1058f c1058f2 = this.f12377a;
            Context context3 = this.f12378b;
            E1.j jVar = this.f12379c;
            return d() ? new E(null, c1058f2, context3, jVar, null, null, null) : new C1054b(null, c1058f2, context3, jVar, null, null, null);
        }

        public C0215a b(C1058f c1058f) {
            this.f12377a = c1058f;
            return this;
        }

        public C0215a c(E1.j jVar) {
            this.f12379c = jVar;
            return this;
        }
    }

    public static C0215a f(Context context) {
        return new C0215a(context, null);
    }

    public abstract void a(C0561a c0561a, InterfaceC0562b interfaceC0562b);

    public abstract void b(C0565e c0565e, InterfaceC0566f interfaceC0566f);

    public abstract void c(C0567g c0567g, InterfaceC0564d interfaceC0564d);

    public abstract boolean d();

    public abstract C1057e e(Activity activity, C1056d c1056d);

    public abstract void g(String str, InterfaceC0568h interfaceC0568h);

    public abstract void h(String str, E1.i iVar);

    public abstract void i(C1059g c1059g, E1.k kVar);

    public abstract void j(InterfaceC0563c interfaceC0563c);
}
