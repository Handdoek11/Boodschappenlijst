package com.headcode.ourgroceries.android;

import android.R;
import android.app.Activity;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.TextView;
import q5.AbstractC6635a;

/* renamed from: com.headcode.ourgroceries.android.x2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5676x2 {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f35106a;

    /* renamed from: b, reason: collision with root package name */
    private final CharSequence f35107b;

    /* renamed from: c, reason: collision with root package name */
    private final PopupWindow f35108c = new PopupWindow();

    /* renamed from: d, reason: collision with root package name */
    private boolean f35109d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f35110e = false;

    /* renamed from: f, reason: collision with root package name */
    private long f35111f;

    /* renamed from: com.headcode.ourgroceries.android.x2$a */
    class a implements View.OnClickListener {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Runnable f35112o;

        a(Runnable runnable) {
            this.f35112o = runnable;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AbstractC5673x.a("spinnerCancel");
            if (C5676x2.this.f35110e) {
                return;
            }
            C5676x2.this.f35110e = true;
            this.f35112o.run();
        }
    }

    /* renamed from: com.headcode.ourgroceries.android.x2$b */
    class b implements PopupWindow.OnDismissListener {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Runnable f35114o;

        b(Runnable runnable) {
            this.f35114o = runnable;
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            if (C5676x2.this.f35110e) {
                return;
            }
            C5676x2.this.f35110e = true;
            this.f35114o.run();
        }
    }

    public C5676x2(Activity activity, CharSequence charSequence) {
        this.f35106a = activity;
        this.f35107b = charSequence;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(Runnable runnable) {
        try {
            if (this.f35109d) {
                try {
                    this.f35108c.dismiss();
                    this.f35109d = false;
                } catch (IllegalArgumentException unused) {
                }
            }
            if (runnable != null) {
                runnable.run();
            }
        } finally {
            X.f34591a.a();
        }
    }

    public void d(final Runnable runnable) {
        long max = Math.max(1000 - (SystemClock.elapsedRealtime() - this.f35111f), 0L);
        X.f34591a.b();
        OurApplication.j().postDelayed(new Runnable() { // from class: com.headcode.ourgroceries.android.w2
            @Override // java.lang.Runnable
            public final void run() {
                this.f35095o.e(runnable);
            }
        }, max);
    }

    public void f(Runnable runnable) {
        View inflate = this.f35106a.getLayoutInflater().inflate(J2.f33685O, (ViewGroup) null);
        View findViewById = this.f35106a.findViewById(R.id.content);
        if (inflate == null || findViewById == null) {
            AbstractC6635a.b("OG-PopupSpinner", "View or parent view is null");
            return;
        }
        ((TextView) inflate.findViewById(H2.f33563b1)).setText(this.f35107b);
        ((Button) inflate.findViewById(H2.f33502G)).setOnClickListener(new a(runnable));
        this.f35108c.setContentView(inflate);
        this.f35108c.setWidth(-1);
        this.f35108c.setHeight(-1);
        this.f35108c.setAnimationStyle(N2.f34245a);
        this.f35108c.setFocusable(true);
        this.f35108c.setTouchable(true);
        this.f35108c.setOnDismissListener(new b(runnable));
        if (!findViewById.isAttachedToWindow()) {
            AbstractC6635a.f("OG-PopupSpinner", "show: parentView.isAttachedToWindow returns false");
        }
        this.f35108c.showAtLocation(findViewById, 17, 0, 0);
        this.f35109d = true;
        this.f35111f = SystemClock.elapsedRealtime();
    }
}
