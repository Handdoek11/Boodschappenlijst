package androidx.transition;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class x {

    /* renamed from: b, reason: collision with root package name */
    public View f11584b;

    /* renamed from: a, reason: collision with root package name */
    public final Map f11583a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    final ArrayList f11585c = new ArrayList();

    public x(View view) {
        this.f11584b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f11584b == xVar.f11584b && this.f11583a.equals(xVar.f11583a);
    }

    public int hashCode() {
        return (this.f11584b.hashCode() * 31) + this.f11583a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f11584b + "\n") + "    values:";
        for (String str2 : this.f11583a.keySet()) {
            str = str + "    " + str2 + ": " + this.f11583a.get(str2) + "\n";
        }
        return str;
    }
}
