package t1;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import s1.m;
import s1.r;
import s1.u;

/* renamed from: t1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6786g extends r {

    /* renamed from: j, reason: collision with root package name */
    private static final String f43808j = s1.j.f("WorkContinuationImpl");

    /* renamed from: a, reason: collision with root package name */
    private final C6789j f43809a;

    /* renamed from: b, reason: collision with root package name */
    private final String f43810b;

    /* renamed from: c, reason: collision with root package name */
    private final s1.d f43811c;

    /* renamed from: d, reason: collision with root package name */
    private final List f43812d;

    /* renamed from: e, reason: collision with root package name */
    private final List f43813e;

    /* renamed from: f, reason: collision with root package name */
    private final List f43814f;

    /* renamed from: g, reason: collision with root package name */
    private final List f43815g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f43816h;

    /* renamed from: i, reason: collision with root package name */
    private m f43817i;

    public C6786g(C6789j c6789j, List list) {
        this(c6789j, null, s1.d.KEEP, list, null);
    }

    private static boolean i(C6786g c6786g, Set set) {
        set.addAll(c6786g.c());
        Set l8 = l(c6786g);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (l8.contains((String) it.next())) {
                return true;
            }
        }
        List e8 = c6786g.e();
        if (e8 != null && !e8.isEmpty()) {
            Iterator it2 = e8.iterator();
            while (it2.hasNext()) {
                if (i((C6786g) it2.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(c6786g.c());
        return false;
    }

    public static Set l(C6786g c6786g) {
        HashSet hashSet = new HashSet();
        List e8 = c6786g.e();
        if (e8 != null && !e8.isEmpty()) {
            Iterator it = e8.iterator();
            while (it.hasNext()) {
                hashSet.addAll(((C6786g) it.next()).c());
            }
        }
        return hashSet;
    }

    public m a() {
        if (this.f43816h) {
            s1.j.c().h(f43808j, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", this.f43813e)), new Throwable[0]);
        } else {
            B1.b bVar = new B1.b(this);
            this.f43809a.p().b(bVar);
            this.f43817i = bVar.d();
        }
        return this.f43817i;
    }

    public s1.d b() {
        return this.f43811c;
    }

    public List c() {
        return this.f43813e;
    }

    public String d() {
        return this.f43810b;
    }

    public List e() {
        return this.f43815g;
    }

    public List f() {
        return this.f43812d;
    }

    public C6789j g() {
        return this.f43809a;
    }

    public boolean h() {
        return i(this, new HashSet());
    }

    public boolean j() {
        return this.f43816h;
    }

    public void k() {
        this.f43816h = true;
    }

    public C6786g(C6789j c6789j, String str, s1.d dVar, List list, List list2) {
        this.f43809a = c6789j;
        this.f43810b = str;
        this.f43811c = dVar;
        this.f43812d = list;
        this.f43815g = list2;
        this.f43813e = new ArrayList(list.size());
        this.f43814f = new ArrayList();
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                this.f43814f.addAll(((C6786g) it.next()).f43814f);
            }
        }
        for (int i8 = 0; i8 < list.size(); i8++) {
            String a8 = ((u) list.get(i8)).a();
            this.f43813e.add(a8);
            this.f43814f.add(a8);
        }
    }
}
