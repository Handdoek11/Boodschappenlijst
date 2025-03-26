package k0;

import com.adadapted.android.sdk.core.device.DeviceInfo;
import j0.AbstractC6050b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public class o {

    /* renamed from: g, reason: collision with root package name */
    static int f38455g;

    /* renamed from: b, reason: collision with root package name */
    int f38457b;

    /* renamed from: d, reason: collision with root package name */
    int f38459d;

    /* renamed from: a, reason: collision with root package name */
    ArrayList f38456a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    boolean f38458c = false;

    /* renamed from: e, reason: collision with root package name */
    ArrayList f38460e = null;

    /* renamed from: f, reason: collision with root package name */
    private int f38461f = -1;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        WeakReference f38462a;

        /* renamed from: b, reason: collision with root package name */
        int f38463b;

        /* renamed from: c, reason: collision with root package name */
        int f38464c;

        /* renamed from: d, reason: collision with root package name */
        int f38465d;

        /* renamed from: e, reason: collision with root package name */
        int f38466e;

        /* renamed from: f, reason: collision with root package name */
        int f38467f;

        /* renamed from: g, reason: collision with root package name */
        int f38468g;

        a(j0.e eVar, g0.d dVar, int i8) {
            this.f38462a = new WeakReference(eVar);
            this.f38463b = dVar.y(eVar.f37930O);
            this.f38464c = dVar.y(eVar.f37931P);
            this.f38465d = dVar.y(eVar.f37932Q);
            this.f38466e = dVar.y(eVar.f37933R);
            this.f38467f = dVar.y(eVar.f37934S);
            this.f38468g = i8;
        }
    }

    public o(int i8) {
        int i9 = f38455g;
        f38455g = i9 + 1;
        this.f38457b = i9;
        this.f38459d = i8;
    }

    private String e() {
        int i8 = this.f38459d;
        return i8 == 0 ? "Horizontal" : i8 == 1 ? "Vertical" : i8 == 2 ? "Both" : DeviceInfo.UNKNOWN_VALUE;
    }

    private int j(g0.d dVar, ArrayList arrayList, int i8) {
        int y7;
        int y8;
        j0.f fVar = (j0.f) ((j0.e) arrayList.get(0)).K();
        dVar.E();
        fVar.g(dVar, false);
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            ((j0.e) arrayList.get(i9)).g(dVar, false);
        }
        if (i8 == 0 && fVar.f38010W0 > 0) {
            AbstractC6050b.b(fVar, dVar, arrayList, 0);
        }
        if (i8 == 1 && fVar.f38011X0 > 0) {
            AbstractC6050b.b(fVar, dVar, arrayList, 1);
        }
        try {
            dVar.A();
        } catch (Exception e8) {
            System.err.println(e8.toString() + "\n" + Arrays.toString(e8.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.f38460e = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            this.f38460e.add(new a((j0.e) arrayList.get(i10), dVar, i8));
        }
        if (i8 == 0) {
            y7 = dVar.y(fVar.f37930O);
            y8 = dVar.y(fVar.f37932Q);
            dVar.E();
        } else {
            y7 = dVar.y(fVar.f37931P);
            y8 = dVar.y(fVar.f37933R);
            dVar.E();
        }
        return y8 - y7;
    }

    public boolean a(j0.e eVar) {
        if (this.f38456a.contains(eVar)) {
            return false;
        }
        this.f38456a.add(eVar);
        return true;
    }

    public void b(ArrayList arrayList) {
        int size = this.f38456a.size();
        if (this.f38461f != -1 && size > 0) {
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                o oVar = (o) arrayList.get(i8);
                if (this.f38461f == oVar.f38457b) {
                    g(this.f38459d, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c() {
        return this.f38457b;
    }

    public int d() {
        return this.f38459d;
    }

    public int f(g0.d dVar, int i8) {
        if (this.f38456a.size() == 0) {
            return 0;
        }
        return j(dVar, this.f38456a, i8);
    }

    public void g(int i8, o oVar) {
        Iterator it = this.f38456a.iterator();
        while (it.hasNext()) {
            j0.e eVar = (j0.e) it.next();
            oVar.a(eVar);
            if (i8 == 0) {
                eVar.f37923I0 = oVar.c();
            } else {
                eVar.f37925J0 = oVar.c();
            }
        }
        this.f38461f = oVar.f38457b;
    }

    public void h(boolean z7) {
        this.f38458c = z7;
    }

    public void i(int i8) {
        this.f38459d = i8;
    }

    public String toString() {
        String str = e() + " [" + this.f38457b + "] <";
        Iterator it = this.f38456a.iterator();
        while (it.hasNext()) {
            str = str + " " + ((j0.e) it.next()).t();
        }
        return str + " >";
    }
}
