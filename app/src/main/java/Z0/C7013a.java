package z0;

import A0.z;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import n0.AbstractC6244c;

/* renamed from: z0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7013a {

    /* renamed from: t, reason: collision with root package name */
    private static final View.AccessibilityDelegate f44727t = new View.AccessibilityDelegate();

    /* renamed from: o, reason: collision with root package name */
    private final View.AccessibilityDelegate f44728o;

    /* renamed from: s, reason: collision with root package name */
    private final View.AccessibilityDelegate f44729s;

    /* renamed from: z0.a$a, reason: collision with other inner class name */
    static final class C0358a extends View.AccessibilityDelegate {

        /* renamed from: a, reason: collision with root package name */
        final C7013a f44730a;

        C0358a(C7013a c7013a) {
            this.f44730a = c7013a;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f44730a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            A0.A b8 = this.f44730a.b(view);
            if (b8 != null) {
                return (AccessibilityNodeProvider) b8.e();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f44730a.j(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            A0.z M02 = A0.z.M0(accessibilityNodeInfo);
            M02.D0(X.U(view));
            M02.u0(X.P(view));
            M02.z0(X.o(view));
            M02.H0(X.G(view));
            this.f44730a.k(view, M02);
            M02.e(accessibilityNodeInfo.getText(), view);
            List c8 = C7013a.c(view);
            for (int i8 = 0; i8 < c8.size(); i8++) {
                M02.b((z.a) c8.get(i8));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f44730a.l(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f44730a.m(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i8, Bundle bundle) {
            return this.f44730a.n(view, i8, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i8) {
            this.f44730a.p(view, i8);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f44730a.q(view, accessibilityEvent);
        }
    }

    public C7013a() {
        this(f44727t);
    }

    static List c(View view) {
        List list = (List) view.getTag(AbstractC6244c.f39490H);
        return list == null ? Collections.emptyList() : list;
    }

    private boolean i(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] q8 = A0.z.q(view.createAccessibilityNodeInfo().getText());
            for (int i8 = 0; q8 != null && i8 < q8.length; i8++) {
                if (clickableSpan.equals(q8[i8])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean o(int i8, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(AbstractC6244c.f39491I);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i8)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!i(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f44728o.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public A0.A b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f44728o.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new A0.A(accessibilityNodeProvider);
        }
        return null;
    }

    View.AccessibilityDelegate g() {
        return this.f44729s;
    }

    public void j(View view, AccessibilityEvent accessibilityEvent) {
        this.f44728o.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void k(View view, A0.z zVar) {
        this.f44728o.onInitializeAccessibilityNodeInfo(view, zVar.L0());
    }

    public void l(View view, AccessibilityEvent accessibilityEvent) {
        this.f44728o.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean m(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f44728o.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean n(View view, int i8, Bundle bundle) {
        List c8 = c(view);
        boolean z7 = false;
        int i9 = 0;
        while (true) {
            if (i9 >= c8.size()) {
                break;
            }
            z.a aVar = (z.a) c8.get(i9);
            if (aVar.b() == i8) {
                z7 = aVar.d(view, bundle);
                break;
            }
            i9++;
        }
        if (!z7) {
            z7 = this.f44728o.performAccessibilityAction(view, i8, bundle);
        }
        return (z7 || i8 != AbstractC6244c.f39502a || bundle == null) ? z7 : o(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public void p(View view, int i8) {
        this.f44728o.sendAccessibilityEvent(view, i8);
    }

    public void q(View view, AccessibilityEvent accessibilityEvent) {
        this.f44728o.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C7013a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f44728o = accessibilityDelegate;
        this.f44729s = new C0358a(this);
    }
}
