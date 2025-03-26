package p3;

import a4.AbstractC0822f;
import a4.C0821e;
import a4.InterfaceC0818b;
import a4.InterfaceC0819c;
import android.app.Activity;
import android.util.Log;
import com.google.android.gms.internal.consent_sdk.zzg;
import j$.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    private final T0 f40191a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f40192b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicReference f40193c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference f40194d = new AtomicReference();

    M(T0 t02, Executor executor) {
        this.f40191a = t02;
        this.f40192b = executor;
    }

    final /* synthetic */ void a(C6377z c6377z) {
        final AtomicReference atomicReference = this.f40194d;
        Objects.requireNonNull(atomicReference);
        c6377z.g(new AbstractC0822f.b() { // from class: p3.D
            @Override // a4.AbstractC0822f.b
            public final void b(InterfaceC0818b interfaceC0818b) {
                atomicReference.set(interfaceC0818b);
            }
        }, new AbstractC0822f.a() { // from class: p3.E
            @Override // a4.AbstractC0822f.a
            public final void a(C0821e c0821e) {
                Log.e("UserMessagingPlatform", "Failed to load and cache a form, error=".concat(String.valueOf(c0821e.b())));
            }
        });
    }

    public final void b(AbstractC0822f.b bVar, AbstractC0822f.a aVar) {
        AbstractC6364s0.a();
        O o8 = (O) this.f40193c.get();
        if (o8 == null) {
            aVar.a(new zzg(3, "No available form can be built.").a());
        } else {
            ((InterfaceC6365t) this.f40191a.zza()).a(o8).zzb().zza().g(bVar, aVar);
        }
    }

    public final void c() {
        O o8 = (O) this.f40193c.get();
        if (o8 == null) {
            Log.e("UserMessagingPlatform", "Failed to load and cache a form due to null consent form resources.");
            return;
        }
        final C6377z zza = ((InterfaceC6365t) this.f40191a.zza()).a(o8).zzb().zza();
        zza.f40402l = true;
        AbstractC6364s0.f40383a.post(new Runnable() { // from class: p3.C
            @Override // java.lang.Runnable
            public final void run() {
                this.f40160o.a(zza);
            }
        });
    }

    public final void d(O o8) {
        this.f40193c.set(o8);
    }

    public final void e(Activity activity, final InterfaceC0818b.a aVar) {
        AbstractC6364s0.a();
        Y0 b8 = AbstractC6328a.a(activity).b();
        if (b8 == null) {
            AbstractC6364s0.f40383a.post(new Runnable() { // from class: p3.F
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.a(new zzg(1, "No consentInformation.").a());
                }
            });
            return;
        }
        if (!b8.e() && b8.b() != InterfaceC0819c.EnumC0131c.NOT_REQUIRED) {
            AbstractC6364s0.f40383a.post(new Runnable() { // from class: p3.G
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.a(new zzg(3, "No valid response received yet.").a());
                }
            });
            b8.f(activity);
        } else {
            if (b8.b() == InterfaceC0819c.EnumC0131c.NOT_REQUIRED) {
                AbstractC6364s0.f40383a.post(new Runnable() { // from class: p3.H
                    @Override // java.lang.Runnable
                    public final void run() {
                        aVar.a(new zzg(3, "Privacy options form is not required.").a());
                    }
                });
                return;
            }
            InterfaceC0818b interfaceC0818b = (InterfaceC0818b) this.f40194d.get();
            if (interfaceC0818b == null) {
                AbstractC6364s0.f40383a.post(new Runnable() { // from class: p3.I
                    @Override // java.lang.Runnable
                    public final void run() {
                        aVar.a(new zzg(3, "Privacy options form is being loading. Please try again later.").a());
                    }
                });
            } else {
                interfaceC0818b.a(activity, aVar);
                this.f40192b.execute(new Runnable() { // from class: p3.J
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f40179o.c();
                    }
                });
            }
        }
    }

    public final boolean f() {
        return this.f40193c.get() != null;
    }
}
