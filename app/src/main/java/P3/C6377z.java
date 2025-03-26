package p3;

import a4.AbstractC0822f;
import a4.InterfaceC0818b;
import android.R;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import com.google.android.gms.internal.consent_sdk.zzg;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import z0.AbstractC7034k0;

/* renamed from: p3.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6377z implements InterfaceC0818b {

    /* renamed from: a, reason: collision with root package name */
    private final Application f40391a;

    /* renamed from: b, reason: collision with root package name */
    private final W f40392b;

    /* renamed from: c, reason: collision with root package name */
    private final C6354n f40393c;

    /* renamed from: d, reason: collision with root package name */
    private final O f40394d;

    /* renamed from: e, reason: collision with root package name */
    private final T0 f40395e;

    /* renamed from: f, reason: collision with root package name */
    private Dialog f40396f;

    /* renamed from: g, reason: collision with root package name */
    private U f40397g;

    /* renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f40398h = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    private final AtomicReference f40399i = new AtomicReference();

    /* renamed from: j, reason: collision with root package name */
    private final AtomicReference f40400j = new AtomicReference();

    /* renamed from: k, reason: collision with root package name */
    private final AtomicReference f40401k = new AtomicReference();

    /* renamed from: l, reason: collision with root package name */
    boolean f40402l = false;

    public C6377z(Application application, C6332c c6332c, W w7, C6354n c6354n, O o8, T0 t02) {
        this.f40391a = application;
        this.f40392b = w7;
        this.f40393c = c6354n;
        this.f40394d = o8;
        this.f40395e = t02;
    }

    private final void l() {
        Dialog dialog = this.f40396f;
        if (dialog != null) {
            dialog.dismiss();
            this.f40396f = null;
        }
        this.f40392b.a(null);
        C6371w c6371w = (C6371w) this.f40401k.getAndSet(null);
        if (c6371w != null) {
            c6371w.b();
        }
    }

    @Override // a4.InterfaceC0818b
    public final void a(Activity activity, InterfaceC0818b.a aVar) {
        AbstractC6364s0.a();
        if (!this.f40398h.compareAndSet(false, true)) {
            aVar.a(new zzg(3, true != this.f40402l ? "ConsentForm#show can only be invoked once." : "Privacy options form is being loading. Please try again later.").a());
            return;
        }
        this.f40397g.c();
        C6371w c6371w = new C6371w(this, activity);
        this.f40391a.registerActivityLifecycleCallbacks(c6371w);
        this.f40401k.set(c6371w);
        this.f40392b.a(activity);
        Dialog dialog = new Dialog(activity, R.style.Theme.Translucent.NoTitleBar);
        dialog.setContentView(this.f40397g);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        if (window == null) {
            aVar.a(new zzg(3, "Activity with null windows is passed in.").a());
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setFlags(16777216, 16777216);
        AbstractC7034k0.b(window, false);
        this.f40400j.set(aVar);
        dialog.show();
        this.f40396f = dialog;
        this.f40397g.d("UMP_messagePresented", "");
    }

    final U d() {
        return this.f40397g;
    }

    final void g(AbstractC0822f.b bVar, AbstractC0822f.a aVar) {
        U zza = ((V) this.f40395e).zza();
        this.f40397g = zza;
        zza.setBackgroundColor(0);
        zza.getSettings().setJavaScriptEnabled(true);
        zza.setWebViewClient(new S(zza, null));
        this.f40399i.set(new C6373x(bVar, aVar, 0 == true ? 1 : 0));
        U u7 = this.f40397g;
        O o8 = this.f40394d;
        u7.loadDataWithBaseURL(o8.a(), o8.b(), "text/html", "UTF-8", null);
        AbstractC6364s0.f40383a.postDelayed(new Runnable() { // from class: p3.v
            @Override // java.lang.Runnable
            public final void run() {
                this.f40386o.k(new zzg(4, "Web view timed out."));
            }
        }, 10000L);
    }

    final void h(int i8) {
        l();
        InterfaceC0818b.a aVar = (InterfaceC0818b.a) this.f40400j.getAndSet(null);
        if (aVar == null) {
            return;
        }
        this.f40393c.f(3);
        aVar.a(null);
    }

    final void i(zzg zzgVar) {
        l();
        InterfaceC0818b.a aVar = (InterfaceC0818b.a) this.f40400j.getAndSet(null);
        if (aVar == null) {
            return;
        }
        aVar.a(zzgVar.a());
    }

    final void j() {
        C6373x c6373x = (C6373x) this.f40399i.getAndSet(null);
        if (c6373x == null) {
            return;
        }
        c6373x.b(this);
    }

    final void k(zzg zzgVar) {
        C6373x c6373x = (C6373x) this.f40399i.getAndSet(null);
        if (c6373x == null) {
            return;
        }
        c6373x.a(zzgVar.a());
    }
}
