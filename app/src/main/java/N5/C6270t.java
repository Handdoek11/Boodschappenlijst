package n5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.headcode.ourgroceries.android.H2;
import com.headcode.ourgroceries.android.J2;
import n1.AbstractC6246a;

/* renamed from: n5.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6270t {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f39739a;

    /* renamed from: b, reason: collision with root package name */
    public final Button f39740b;

    /* renamed from: c, reason: collision with root package name */
    public final Button f39741c;

    /* renamed from: d, reason: collision with root package name */
    public final Button f39742d;

    /* renamed from: e, reason: collision with root package name */
    public final TabLayout f39743e;

    /* renamed from: f, reason: collision with root package name */
    public final ViewPager2 f39744f;

    private C6270t(LinearLayout linearLayout, Button button, Button button2, Button button3, TabLayout tabLayout, ViewPager2 viewPager2) {
        this.f39739a = linearLayout;
        this.f39740b = button;
        this.f39741c = button2;
        this.f39742d = button3;
        this.f39743e = tabLayout;
        this.f39744f = viewPager2;
    }

    public static C6270t a(View view) {
        int i8 = H2.f33578g1;
        Button button = (Button) AbstractC6246a.a(view, i8);
        if (button != null) {
            i8 = H2.f33599n1;
            Button button2 = (Button) AbstractC6246a.a(view, i8);
            if (button2 != null) {
                i8 = H2.f33614s1;
                Button button3 = (Button) AbstractC6246a.a(view, i8);
                if (button3 != null) {
                    i8 = H2.f33632y1;
                    TabLayout tabLayout = (TabLayout) AbstractC6246a.a(view, i8);
                    if (tabLayout != null) {
                        i8 = H2.f33549V1;
                        ViewPager2 viewPager2 = (ViewPager2) AbstractC6246a.a(view, i8);
                        if (viewPager2 != null) {
                            return new C6270t((LinearLayout) view, button, button2, button3, tabLayout, viewPager2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static C6270t c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C6270t d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(J2.f33694X, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f39739a;
    }
}
