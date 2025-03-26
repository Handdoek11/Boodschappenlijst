package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import f.AbstractC5755d;
import f.AbstractC5757f;
import f.AbstractC5758g;

/* loaded from: classes.dex */
class o0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f7906a;

    /* renamed from: b, reason: collision with root package name */
    private final View f7907b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f7908c;

    /* renamed from: d, reason: collision with root package name */
    private final WindowManager.LayoutParams f7909d;

    /* renamed from: e, reason: collision with root package name */
    private final Rect f7910e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f7911f;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f7912g;

    o0(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f7909d = layoutParams;
        this.f7910e = new Rect();
        this.f7911f = new int[2];
        this.f7912g = new int[2];
        this.f7906a = context;
        View inflate = LayoutInflater.from(context).inflate(AbstractC5758g.f35527s, (ViewGroup) null);
        this.f7907b = inflate;
        this.f7908c = (TextView) inflate.findViewById(AbstractC5757f.f35501s);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = f.i.f35543a;
        layoutParams.flags = 24;
    }

    private void a(View view, int i8, int i9, boolean z7, WindowManager.LayoutParams layoutParams) {
        int height;
        int i10;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f7906a.getResources().getDimensionPixelOffset(AbstractC5755d.f35419k);
        if (view.getWidth() < dimensionPixelOffset) {
            i8 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f7906a.getResources().getDimensionPixelOffset(AbstractC5755d.f35418j);
            height = i9 + dimensionPixelOffset2;
            i10 = i9 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i10 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f7906a.getResources().getDimensionPixelOffset(z7 ? AbstractC5755d.f35421m : AbstractC5755d.f35420l);
        View b8 = b(view);
        if (b8 == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        b8.getWindowVisibleDisplayFrame(this.f7910e);
        Rect rect = this.f7910e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f7906a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f7910e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        b8.getLocationOnScreen(this.f7912g);
        view.getLocationOnScreen(this.f7911f);
        int[] iArr = this.f7911f;
        int i11 = iArr[0];
        int[] iArr2 = this.f7912g;
        int i12 = i11 - iArr2[0];
        iArr[0] = i12;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i12 + i8) - (b8.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f7907b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f7907b.getMeasuredHeight();
        int i13 = this.f7911f[1];
        int i14 = ((i10 + i13) - dimensionPixelOffset3) - measuredHeight;
        int i15 = i13 + height + dimensionPixelOffset3;
        if (z7) {
            if (i14 >= 0) {
                layoutParams.y = i14;
                return;
            } else {
                layoutParams.y = i15;
                return;
            }
        }
        if (measuredHeight + i15 <= this.f7910e.height()) {
            layoutParams.y = i15;
        } else {
            layoutParams.y = i14;
        }
    }

    private static View b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    void c() {
        if (d()) {
            ((WindowManager) this.f7906a.getSystemService("window")).removeView(this.f7907b);
        }
    }

    boolean d() {
        return this.f7907b.getParent() != null;
    }

    void e(View view, int i8, int i9, boolean z7, CharSequence charSequence) {
        if (d()) {
            c();
        }
        this.f7908c.setText(charSequence);
        a(view, i8, i9, z7, this.f7909d);
        ((WindowManager) this.f7906a.getSystemService("window")).addView(this.f7907b, this.f7909d);
    }
}
