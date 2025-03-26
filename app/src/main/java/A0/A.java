package A0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class A {

    /* renamed from: a, reason: collision with root package name */
    private final Object f2a;

    static class a extends AccessibilityNodeProvider {

        /* renamed from: a, reason: collision with root package name */
        final A f3a;

        a(A a8) {
            this.f3a = a8;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i8) {
            z b8 = this.f3a.b(i8);
            if (b8 == null) {
                return null;
            }
            return b8.L0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List findAccessibilityNodeInfosByText(String str, int i8) {
            List c8 = this.f3a.c(str, i8);
            if (c8 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = c8.size();
            for (int i9 = 0; i9 < size; i9++) {
                arrayList.add(((z) c8.get(i9)).L0());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i8) {
            z d8 = this.f3a.d(i8);
            if (d8 == null) {
                return null;
            }
            return d8.L0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i8, int i9, Bundle bundle) {
            return this.f3a.f(i8, i9, bundle);
        }
    }

    static class b extends a {
        b(A a8) {
            super(a8);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i8, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f3a.a(i8, z.M0(accessibilityNodeInfo), str, bundle);
        }
    }

    public A() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2a = new b(this);
        } else {
            this.f2a = new a(this);
        }
    }

    public z b(int i8) {
        return null;
    }

    public List c(String str, int i8) {
        return null;
    }

    public z d(int i8) {
        return null;
    }

    public Object e() {
        return this.f2a;
    }

    public boolean f(int i8, int i9, Bundle bundle) {
        return false;
    }

    public A(Object obj) {
        this.f2a = obj;
    }

    public void a(int i8, z zVar, String str, Bundle bundle) {
    }
}
