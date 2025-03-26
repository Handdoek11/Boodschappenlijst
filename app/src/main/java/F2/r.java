package F2;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.InterfaceC4410vt;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f2274a;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup.LayoutParams f2275b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f2276c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f2277d;

    public r(InterfaceC4410vt interfaceC4410vt) {
        this.f2275b = interfaceC4410vt.getLayoutParams();
        ViewParent parent = interfaceC4410vt.getParent();
        this.f2277d = interfaceC4410vt.q0();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new p("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.f2276c = viewGroup;
        this.f2274a = viewGroup.indexOfChild(interfaceC4410vt.M());
        viewGroup.removeView(interfaceC4410vt.M());
        interfaceC4410vt.X0(true);
    }
}
