package j0;

import g0.C5797c;
import g0.i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import k0.o;

/* loaded from: classes.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    private int f37887b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f37888c;

    /* renamed from: d, reason: collision with root package name */
    public final e f37889d;

    /* renamed from: e, reason: collision with root package name */
    public final a f37890e;

    /* renamed from: f, reason: collision with root package name */
    public d f37891f;

    /* renamed from: i, reason: collision with root package name */
    g0.i f37894i;

    /* renamed from: a, reason: collision with root package name */
    private HashSet f37886a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f37892g = 0;

    /* renamed from: h, reason: collision with root package name */
    int f37893h = Integer.MIN_VALUE;

    public enum a {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(e eVar, a aVar) {
        this.f37889d = eVar;
        this.f37890e = aVar;
    }

    public boolean a(d dVar, int i8) {
        return b(dVar, i8, Integer.MIN_VALUE, false);
    }

    public boolean b(d dVar, int i8, int i9, boolean z7) {
        if (dVar == null) {
            q();
            return true;
        }
        if (!z7 && !p(dVar)) {
            return false;
        }
        this.f37891f = dVar;
        if (dVar.f37886a == null) {
            dVar.f37886a = new HashSet();
        }
        HashSet hashSet = this.f37891f.f37886a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f37892g = i8;
        this.f37893h = i9;
        return true;
    }

    public void c(int i8, ArrayList arrayList, o oVar) {
        HashSet hashSet = this.f37886a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                k0.i.a(((d) it.next()).f37889d, i8, arrayList, oVar);
            }
        }
    }

    public HashSet d() {
        return this.f37886a;
    }

    public int e() {
        if (this.f37888c) {
            return this.f37887b;
        }
        return 0;
    }

    public int f() {
        d dVar;
        if (this.f37889d.V() == 8) {
            return 0;
        }
        return (this.f37893h == Integer.MIN_VALUE || (dVar = this.f37891f) == null || dVar.f37889d.V() != 8) ? this.f37892g : this.f37893h;
    }

    public final d g() {
        switch (this.f37890e) {
            case NONE:
            case BASELINE:
            case CENTER:
            case CENTER_X:
            case CENTER_Y:
                return null;
            case LEFT:
                return this.f37889d.f37932Q;
            case TOP:
                return this.f37889d.f37933R;
            case RIGHT:
                return this.f37889d.f37930O;
            case BOTTOM:
                return this.f37889d.f37931P;
            default:
                throw new AssertionError(this.f37890e.name());
        }
    }

    public e h() {
        return this.f37889d;
    }

    public g0.i i() {
        return this.f37894i;
    }

    public d j() {
        return this.f37891f;
    }

    public a k() {
        return this.f37890e;
    }

    public boolean l() {
        HashSet hashSet = this.f37886a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((d) it.next()).g().o()) {
                return true;
            }
        }
        return false;
    }

    public boolean m() {
        HashSet hashSet = this.f37886a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean n() {
        return this.f37888c;
    }

    public boolean o() {
        return this.f37891f != null;
    }

    public boolean p(d dVar) {
        if (dVar == null) {
            return false;
        }
        a k8 = dVar.k();
        a aVar = this.f37890e;
        if (k8 == aVar) {
            return aVar != a.BASELINE || (dVar.h().Z() && h().Z());
        }
        switch (aVar) {
            case NONE:
            case CENTER_X:
            case CENTER_Y:
                return false;
            case LEFT:
            case RIGHT:
                boolean z7 = k8 == a.LEFT || k8 == a.RIGHT;
                if (dVar.h() instanceof h) {
                    return z7 || k8 == a.CENTER_X;
                }
                return z7;
            case TOP:
            case BOTTOM:
                boolean z8 = k8 == a.TOP || k8 == a.BOTTOM;
                if (dVar.h() instanceof h) {
                    return z8 || k8 == a.CENTER_Y;
                }
                return z8;
            case BASELINE:
                return (k8 == a.LEFT || k8 == a.RIGHT) ? false : true;
            case CENTER:
                return (k8 == a.BASELINE || k8 == a.CENTER_X || k8 == a.CENTER_Y) ? false : true;
            default:
                throw new AssertionError(this.f37890e.name());
        }
    }

    public void q() {
        HashSet hashSet;
        d dVar = this.f37891f;
        if (dVar != null && (hashSet = dVar.f37886a) != null) {
            hashSet.remove(this);
            if (this.f37891f.f37886a.size() == 0) {
                this.f37891f.f37886a = null;
            }
        }
        this.f37886a = null;
        this.f37891f = null;
        this.f37892g = 0;
        this.f37893h = Integer.MIN_VALUE;
        this.f37888c = false;
        this.f37887b = 0;
    }

    public void r() {
        this.f37888c = false;
        this.f37887b = 0;
    }

    public void s(C5797c c5797c) {
        g0.i iVar = this.f37894i;
        if (iVar == null) {
            this.f37894i = new g0.i(i.a.UNRESTRICTED, null);
        } else {
            iVar.h();
        }
    }

    public void t(int i8) {
        this.f37887b = i8;
        this.f37888c = true;
    }

    public String toString() {
        return this.f37889d.t() + ":" + this.f37890e.toString();
    }

    public void u(int i8) {
        if (o()) {
            this.f37893h = i8;
        }
    }
}
