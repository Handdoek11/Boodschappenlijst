package com.google.android.material.datepicker;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e;
import androidx.fragment.app.E;
import com.google.android.material.datepicker.C5465a;
import com.google.android.material.internal.CheckableImageButton;
import g.AbstractC5794a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import z0.C7061y0;
import z0.InterfaceC7004H;
import z0.X;

/* loaded from: classes2.dex */
public final class l<S> extends DialogInterfaceOnCancelListenerC0906e {

    /* renamed from: l1, reason: collision with root package name */
    static final Object f31835l1 = "CONFIRM_BUTTON_TAG";

    /* renamed from: m1, reason: collision with root package name */
    static final Object f31836m1 = "CANCEL_BUTTON_TAG";

    /* renamed from: n1, reason: collision with root package name */
    static final Object f31837n1 = "TOGGLE_BUTTON_TAG";

    /* renamed from: J0, reason: collision with root package name */
    private final LinkedHashSet f31838J0 = new LinkedHashSet();

    /* renamed from: K0, reason: collision with root package name */
    private final LinkedHashSet f31839K0 = new LinkedHashSet();

    /* renamed from: L0, reason: collision with root package name */
    private final LinkedHashSet f31840L0 = new LinkedHashSet();

    /* renamed from: M0, reason: collision with root package name */
    private final LinkedHashSet f31841M0 = new LinkedHashSet();

    /* renamed from: N0, reason: collision with root package name */
    private int f31842N0;

    /* renamed from: O0, reason: collision with root package name */
    private r f31843O0;

    /* renamed from: P0, reason: collision with root package name */
    private C5465a f31844P0;

    /* renamed from: Q0, reason: collision with root package name */
    private j f31845Q0;

    /* renamed from: R0, reason: collision with root package name */
    private int f31846R0;

    /* renamed from: S0, reason: collision with root package name */
    private CharSequence f31847S0;

    /* renamed from: T0, reason: collision with root package name */
    private boolean f31848T0;

    /* renamed from: U0, reason: collision with root package name */
    private int f31849U0;

    /* renamed from: V0, reason: collision with root package name */
    private int f31850V0;

    /* renamed from: W0, reason: collision with root package name */
    private CharSequence f31851W0;

    /* renamed from: X0, reason: collision with root package name */
    private int f31852X0;

    /* renamed from: Y0, reason: collision with root package name */
    private CharSequence f31853Y0;

    /* renamed from: Z0, reason: collision with root package name */
    private int f31854Z0;

    /* renamed from: a1, reason: collision with root package name */
    private CharSequence f31855a1;

    /* renamed from: b1, reason: collision with root package name */
    private int f31856b1;

    /* renamed from: c1, reason: collision with root package name */
    private CharSequence f31857c1;

    /* renamed from: d1, reason: collision with root package name */
    private TextView f31858d1;

    /* renamed from: e1, reason: collision with root package name */
    private TextView f31859e1;

    /* renamed from: f1, reason: collision with root package name */
    private CheckableImageButton f31860f1;

    /* renamed from: g1, reason: collision with root package name */
    private V3.g f31861g1;

    /* renamed from: h1, reason: collision with root package name */
    private Button f31862h1;

    /* renamed from: i1, reason: collision with root package name */
    private boolean f31863i1;

    /* renamed from: j1, reason: collision with root package name */
    private CharSequence f31864j1;

    /* renamed from: k1, reason: collision with root package name */
    private CharSequence f31865k1;

    class a implements InterfaceC7004H {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f31866a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f31867b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f31868c;

        a(int i8, View view, int i9) {
            this.f31866a = i8;
            this.f31867b = view;
            this.f31868c = i9;
        }

        @Override // z0.InterfaceC7004H
        public C7061y0 a(View view, C7061y0 c7061y0) {
            int i8 = c7061y0.f(C7061y0.l.d()).f40898b;
            if (this.f31866a >= 0) {
                this.f31867b.getLayoutParams().height = this.f31866a + i8;
                View view2 = this.f31867b;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.f31867b;
            view3.setPadding(view3.getPaddingLeft(), this.f31868c + i8, this.f31867b.getPaddingRight(), this.f31867b.getPaddingBottom());
            return c7061y0;
        }
    }

    class b extends q {
        b() {
        }
    }

    private int A2(Context context) {
        int i8 = this.f31842N0;
        if (i8 != 0) {
            return i8;
        }
        v2();
        throw null;
    }

    private void B2(Context context) {
        this.f31860f1.setTag(f31837n1);
        this.f31860f1.setImageDrawable(t2(context));
        this.f31860f1.setChecked(this.f31849U0 != 0);
        X.n0(this.f31860f1, null);
        K2(this.f31860f1);
        this.f31860f1.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f31834o.F2(view);
            }
        });
    }

    static boolean C2(Context context) {
        return G2(context, R.attr.windowFullscreen);
    }

    private boolean D2() {
        return g0().getConfiguration().orientation == 2;
    }

    static boolean E2(Context context) {
        return G2(context, D3.b.f1387K);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F2(View view) {
        v2();
        throw null;
    }

    static boolean G2(Context context, int i8) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(S3.b.d(context, D3.b.f1423v, j.class.getCanonicalName()), new int[]{i8});
        boolean z7 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z7;
    }

    private void H2() {
        int A22 = A2(L1());
        v2();
        j t22 = j.t2(null, A22, this.f31844P0, null);
        this.f31845Q0 = t22;
        r rVar = t22;
        if (this.f31849U0 == 1) {
            v2();
            rVar = m.f2(null, A22, this.f31844P0);
        }
        this.f31843O0 = rVar;
        J2();
        I2(y2());
        E o8 = y().o();
        o8.n(D3.f.f1554y, this.f31843O0);
        o8.i();
        this.f31843O0.d2(new b());
    }

    private void J2() {
        this.f31858d1.setText((this.f31849U0 == 1 && D2()) ? this.f31865k1 : this.f31864j1);
    }

    private void K2(CheckableImageButton checkableImageButton) {
        this.f31860f1.setContentDescription(this.f31849U0 == 1 ? checkableImageButton.getContext().getString(D3.j.f1607w) : checkableImageButton.getContext().getString(D3.j.f1609y));
    }

    private static Drawable t2(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, AbstractC5794a.b(context, D3.e.f1502b));
        stateListDrawable.addState(new int[0], AbstractC5794a.b(context, D3.e.f1503c));
        return stateListDrawable;
    }

    private void u2(Window window) {
        if (this.f31863i1) {
            return;
        }
        View findViewById = M1().findViewById(D3.f.f1536g);
        com.google.android.material.internal.c.a(window, true, com.google.android.material.internal.o.d(findViewById), null);
        X.A0(findViewById, new a(findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop()));
        this.f31863i1 = true;
    }

    private d v2() {
        androidx.appcompat.app.E.a(x().getParcelable("DATE_SELECTOR_KEY"));
        return null;
    }

    private static CharSequence w2(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String[] split = TextUtils.split(String.valueOf(charSequence), "\n");
        return split.length > 1 ? split[0] : charSequence;
    }

    private String x2() {
        v2();
        L1();
        throw null;
    }

    private static int z2(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(D3.d.f1454Q);
        int i8 = n.g().f31877u;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(D3.d.f1456S) * i8) + ((i8 - 1) * resources.getDimensionPixelOffset(D3.d.f1459V));
    }

    void I2(String str) {
        this.f31859e1.setContentDescription(x2());
        this.f31859e1.setText(str);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e, androidx.fragment.app.Fragment
    public final void J0(Bundle bundle) {
        super.J0(bundle);
        if (bundle == null) {
            bundle = x();
        }
        this.f31842N0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        androidx.appcompat.app.E.a(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f31844P0 = (C5465a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        androidx.appcompat.app.E.a(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.f31846R0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f31847S0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f31849U0 = bundle.getInt("INPUT_MODE_KEY");
        this.f31850V0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f31851W0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f31852X0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f31853Y0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f31854Z0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f31855a1 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f31856b1 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f31857c1 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence = this.f31847S0;
        if (charSequence == null) {
            charSequence = L1().getResources().getText(this.f31846R0);
        }
        this.f31864j1 = charSequence;
        this.f31865k1 = w2(charSequence);
    }

    @Override // androidx.fragment.app.Fragment
    public final View N0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.f31848T0 ? D3.h.f1581x : D3.h.f1580w, viewGroup);
        Context context = inflate.getContext();
        if (this.f31848T0) {
            inflate.findViewById(D3.f.f1554y).setLayoutParams(new LinearLayout.LayoutParams(z2(context), -2));
        } else {
            inflate.findViewById(D3.f.f1555z).setLayoutParams(new LinearLayout.LayoutParams(z2(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(D3.f.f1515E);
        this.f31859e1 = textView;
        X.p0(textView, 1);
        this.f31860f1 = (CheckableImageButton) inflate.findViewById(D3.f.f1516F);
        this.f31858d1 = (TextView) inflate.findViewById(D3.f.f1517G);
        B2(context);
        this.f31862h1 = (Button) inflate.findViewById(D3.f.f1533d);
        v2();
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e, androidx.fragment.app.Fragment
    public final void f1(Bundle bundle) {
        super.f1(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f31842N0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        C5465a.b bVar = new C5465a.b(this.f31844P0);
        j jVar = this.f31845Q0;
        n o22 = jVar == null ? null : jVar.o2();
        if (o22 != null) {
            bVar.b(o22.f31879w);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f31846R0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f31847S0);
        bundle.putInt("INPUT_MODE_KEY", this.f31849U0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f31850V0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f31851W0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f31852X0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f31853Y0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f31854Z0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f31855a1);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f31856b1);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f31857c1);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e, androidx.fragment.app.Fragment
    public void g1() {
        super.g1();
        Window window = o2().getWindow();
        if (this.f31848T0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f31861g1);
            u2(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = g0().getDimensionPixelOffset(D3.d.f1458U);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f31861g1, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new M3.a(o2(), rect));
        }
        H2();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e, androidx.fragment.app.Fragment
    public void h1() {
        this.f31843O0.e2();
        super.h1();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e
    public final Dialog k2(Bundle bundle) {
        Dialog dialog = new Dialog(L1(), A2(L1()));
        Context context = dialog.getContext();
        this.f31848T0 = C2(context);
        this.f31861g1 = new V3.g(context, null, D3.b.f1423v, D3.k.f1630t);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, D3.l.f1989q3, D3.b.f1423v, D3.k.f1630t);
        int color = obtainStyledAttributes.getColor(D3.l.f1998r3, 0);
        obtainStyledAttributes.recycle();
        this.f31861g1.J(context);
        this.f31861g1.U(ColorStateList.valueOf(color));
        this.f31861g1.T(X.u(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f31840L0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0906e, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f31841M0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) q0();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public String y2() {
        v2();
        B();
        throw null;
    }
}
