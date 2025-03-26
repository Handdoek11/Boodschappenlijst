package com.google.firebase.crashlytics;

import A3.InterfaceC0372f;
import I4.e;
import android.content.Context;
import android.content.pm.PackageManager;
import com.google.firebase.f;
import i4.C5857d;
import j4.C6077d;
import j4.g;
import j4.l;
import java.util.List;
import java.util.concurrent.ExecutorService;
import m4.AbstractC6203i;
import m4.C6195a;
import m4.C6200f;
import m4.C6207m;
import m4.C6218y;
import m4.E;
import m4.J;
import r4.C6706b;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    final C6218y f32779a;

    private a(C6218y c6218y) {
        this.f32779a = c6218y;
    }

    public static a b() {
        a aVar = (a) f.l().j(a.class);
        if (aVar != null) {
            return aVar;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    static a c(f fVar, e eVar, H4.a aVar, H4.a aVar2, H4.a aVar3, ExecutorService executorService, ExecutorService executorService2, ExecutorService executorService3) {
        Context k8 = fVar.k();
        String packageName = k8.getPackageName();
        g.f().g("Initializing Firebase Crashlytics " + C6218y.m() + " for " + packageName);
        n4.f fVar2 = new n4.f(executorService, executorService2);
        s4.g gVar = new s4.g(k8);
        E e8 = new E(fVar);
        J j8 = new J(k8, packageName, eVar, e8);
        C6077d c6077d = new C6077d(aVar);
        C5857d c5857d = new C5857d(aVar2);
        C6207m c6207m = new C6207m(e8, gVar);
        S4.a.e(c6207m);
        C6218y c6218y = new C6218y(fVar, j8, c6077d, e8, c5857d.e(), c5857d.d(), gVar, c6207m, new l(aVar3), fVar2);
        String c8 = fVar.n().c();
        String m8 = AbstractC6203i.m(k8);
        List<C6200f> j9 = AbstractC6203i.j(k8);
        g.f().b("Mapping file ID is: " + m8);
        for (C6200f c6200f : j9) {
            g.f().b(String.format("Build id for %s on %s: %s", c6200f.c(), c6200f.a(), c6200f.b()));
        }
        try {
            C6195a a8 = C6195a.a(k8, j8, c8, m8, j9, new j4.f(k8));
            g.f().i("Installer package name is: " + a8.f39023d);
            u4.g l8 = u4.g.l(k8, c8, j8, new C6706b(), a8.f39025f, a8.f39026g, gVar, e8);
            l8.o(fVar2).g(executorService3, new InterfaceC0372f() { // from class: i4.g
                @Override // A3.InterfaceC0372f
                public final void e(Exception exc) {
                    com.google.firebase.crashlytics.a.d(exc);
                }
            });
            if (c6218y.z(a8, l8)) {
                c6218y.k(l8);
            }
            return new a(c6218y);
        } catch (PackageManager.NameNotFoundException e9) {
            g.f().e("Error retrieving app package info.", e9);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(Exception exc) {
        g.f().e("Error fetching settings.", exc);
    }

    public void e(Throwable th) {
        if (th == null) {
            g.f().k("A null value was passed to recordException. Ignoring.");
        } else {
            this.f32779a.w(th);
        }
    }

    public void f(String str) {
        this.f32779a.A(str);
    }
}
