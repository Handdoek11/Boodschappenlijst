package n5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.headcode.ourgroceries.android.H2;
import com.headcode.ourgroceries.android.J2;
import com.headcode.ourgroceries.android.view.BoundedButton;
import n1.AbstractC6246a;

/* renamed from: n5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6252b {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f39606a;

    /* renamed from: b, reason: collision with root package name */
    public final BoundedButton f39607b;

    /* renamed from: c, reason: collision with root package name */
    public final BoundedButton f39608c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayout f39609d;

    /* renamed from: e, reason: collision with root package name */
    public final Toolbar f39610e;

    /* renamed from: f, reason: collision with root package name */
    public final LinearLayout f39611f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f39612g;

    private C6252b(LinearLayout linearLayout, BoundedButton boundedButton, BoundedButton boundedButton2, LinearLayout linearLayout2, Toolbar toolbar, LinearLayout linearLayout3, TextView textView) {
        this.f39606a = linearLayout;
        this.f39607b = boundedButton;
        this.f39608c = boundedButton2;
        this.f39609d = linearLayout2;
        this.f39610e = toolbar;
        this.f39611f = linearLayout3;
        this.f39612g = textView;
    }

    public static C6252b a(View view) {
        int i8 = H2.f33508I;
        BoundedButton boundedButton = (BoundedButton) AbstractC6246a.a(view, i8);
        if (boundedButton != null) {
            i8 = H2.f33554Y;
            BoundedButton boundedButton2 = (BoundedButton) AbstractC6246a.a(view, i8);
            if (boundedButton2 != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                i8 = H2.f33587j1;
                Toolbar toolbar = (Toolbar) AbstractC6246a.a(view, i8);
                if (toolbar != null) {
                    i8 = H2.f33620u1;
                    LinearLayout linearLayout2 = (LinearLayout) AbstractC6246a.a(view, i8);
                    if (linearLayout2 != null) {
                        i8 = H2.f33623v1;
                        TextView textView = (TextView) AbstractC6246a.a(view, i8);
                        if (textView != null) {
                            return new C6252b(linearLayout, boundedButton, boundedButton2, linearLayout, toolbar, linearLayout2, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static C6252b c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C6252b d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(J2.f33699b, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f39606a;
    }
}
