package com.headcode.ourgroceries.android;

import a2.C0812d;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import b2.InterfaceC0956b;

/* renamed from: com.headcode.ourgroceries.android.h0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5557h0 extends C0812d {

    /* renamed from: A, reason: collision with root package name */
    private final Runnable f34750A;

    /* renamed from: z, reason: collision with root package name */
    private boolean f34751z;

    public C5557h0(ImageView imageView) {
        super(imageView);
        this.f34751z = false;
        this.f34750A = new Runnable() { // from class: com.headcode.ourgroceries.android.f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f34730o.v();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v() {
        y(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(Handler handler, int i8, int i9) {
        handler.removeCallbacks(this.f34750A);
    }

    private void y(boolean z7) {
        if (z7 != this.f34751z) {
            if (z7) {
                X.f34591a.b();
            } else {
                X.f34591a.a();
            }
            this.f34751z = z7;
        }
    }

    @Override // a2.e, a2.AbstractC0809a, a2.h
    public void e(Drawable drawable) {
        y(false);
        super.e(drawable);
    }

    @Override // a2.e, a2.i, a2.AbstractC0809a, a2.h
    public void h(Drawable drawable) {
        y(true);
        final Handler handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(this.f34750A, 1000L);
        d(new a2.g() { // from class: com.headcode.ourgroceries.android.g0
            @Override // a2.g
            public final void d(int i8, int i9) {
                this.f34739a.w(handler, i8, i9);
            }
        });
        super.h(drawable);
    }

    @Override // a2.e, a2.i, a2.AbstractC0809a, a2.h
    public void j(Drawable drawable) {
        y(false);
        super.j(drawable);
    }

    @Override // a2.e, a2.h
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void g(Drawable drawable, InterfaceC0956b interfaceC0956b) {
        y(false);
        super.g(drawable, interfaceC0956b);
    }
}
