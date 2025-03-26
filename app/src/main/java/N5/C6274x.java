package n5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.headcode.ourgroceries.android.H2;
import com.headcode.ourgroceries.android.J2;
import com.headcode.ourgroceries.android.view.WelcomeLayout;
import n1.AbstractC6246a;

/* renamed from: n5.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6274x {

    /* renamed from: a, reason: collision with root package name */
    private final WelcomeLayout f39772a;

    /* renamed from: b, reason: collision with root package name */
    public final Button f39773b;

    /* renamed from: c, reason: collision with root package name */
    public final Button f39774c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f39775d;

    private C6274x(WelcomeLayout welcomeLayout, Button button, Button button2, TextView textView) {
        this.f39772a = welcomeLayout;
        this.f39773b = button;
        this.f39774c = button2;
        this.f39775d = textView;
    }

    public static C6274x a(View view) {
        int i8 = H2.f33493D;
        Button button = (Button) AbstractC6246a.a(view, i8);
        if (button != null) {
            i8 = H2.f33496E;
            Button button2 = (Button) AbstractC6246a.a(view, i8);
            if (button2 != null) {
                i8 = H2.f33635z1;
                TextView textView = (TextView) AbstractC6246a.a(view, i8);
                if (textView != null) {
                    return new C6274x((WelcomeLayout) view, button, button2, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static C6274x c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C6274x d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(J2.f33698a0, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public WelcomeLayout b() {
        return this.f39772a;
    }
}
