package F2;

import D2.C0555y;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.google.android.gms.internal.ads.AbstractC3184kf;

/* loaded from: classes.dex */
public final class C extends FrameLayout implements View.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    private final ImageButton f2242o;

    /* renamed from: s, reason: collision with root package name */
    private final InterfaceC0576h f2243s;

    public C(Context context, B b8, InterfaceC0576h interfaceC0576h) {
        super(context);
        this.f2243s = interfaceC0576h;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.f2242o = imageButton;
        d();
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(this);
        C0555y.b();
        int B7 = H2.g.B(context, b8.f2238a);
        C0555y.b();
        int B8 = H2.g.B(context, 0);
        C0555y.b();
        int B9 = H2.g.B(context, b8.f2239b);
        C0555y.b();
        imageButton.setPadding(B7, B8, B9, H2.g.B(context, b8.f2240c));
        imageButton.setContentDescription("Interstitial close button");
        C0555y.b();
        int B10 = H2.g.B(context, b8.f2241d + b8.f2238a + b8.f2239b);
        C0555y.b();
        addView(imageButton, new FrameLayout.LayoutParams(B10, H2.g.B(context, b8.f2241d + b8.f2240c), 17));
        long longValue = ((Long) D2.A.c().a(AbstractC3184kf.f23939l1)).longValue();
        if (longValue <= 0) {
            return;
        }
        A a8 = ((Boolean) D2.A.c().a(AbstractC3184kf.f23948m1)).booleanValue() ? new A(this) : null;
        imageButton.setAlpha(0.0f);
        imageButton.animate().alpha(1.0f).setDuration(longValue).setListener(a8);
    }

    private final void d() {
        String str = (String) D2.A.c().a(AbstractC3184kf.f23930k1);
        if (!f3.m.f() || TextUtils.isEmpty(str) || "default".equals(str)) {
            this.f2242o.setImageResource(R.drawable.btn_dialog);
            return;
        }
        Resources f8 = C2.v.s().f();
        if (f8 == null) {
            this.f2242o.setImageResource(R.drawable.btn_dialog);
            return;
        }
        Drawable drawable = null;
        try {
            if ("white".equals(str)) {
                drawable = f8.getDrawable(A2.a.f144b);
            } else if ("black".equals(str)) {
                drawable = f8.getDrawable(A2.a.f143a);
            }
        } catch (Resources.NotFoundException unused) {
            H2.p.b("Close button resource not found, falling back to default.");
        }
        if (drawable == null) {
            this.f2242o.setImageResource(R.drawable.btn_dialog);
        } else {
            this.f2242o.setImageDrawable(drawable);
            this.f2242o.setScaleType(ImageView.ScaleType.CENTER);
        }
    }

    public final void b(boolean z7) {
        if (!z7) {
            this.f2242o.setVisibility(0);
            return;
        }
        this.f2242o.setVisibility(8);
        if (((Long) D2.A.c().a(AbstractC3184kf.f23939l1)).longValue() > 0) {
            this.f2242o.animate().cancel();
            this.f2242o.clearAnimation();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0576h interfaceC0576h = this.f2243s;
        if (interfaceC0576h != null) {
            interfaceC0576h.h();
        }
    }
}
