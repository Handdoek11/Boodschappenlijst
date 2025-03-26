package g4;

import com.google.firebase.components.DependencyException;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
final class C implements e {

    /* renamed from: a, reason: collision with root package name */
    private final Set f36015a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f36016b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f36017c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f36018d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f36019e;

    /* renamed from: f, reason: collision with root package name */
    private final Set f36020f;

    /* renamed from: g, reason: collision with root package name */
    private final e f36021g;

    private static class a implements E4.c {

        /* renamed from: a, reason: collision with root package name */
        private final Set f36022a;

        /* renamed from: b, reason: collision with root package name */
        private final E4.c f36023b;

        public a(Set set, E4.c cVar) {
            this.f36022a = set;
            this.f36023b = cVar;
        }
    }

    C(C5807c c5807c, e eVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (r rVar : c5807c.g()) {
            if (rVar.e()) {
                if (rVar.g()) {
                    hashSet4.add(rVar.c());
                } else {
                    hashSet.add(rVar.c());
                }
            } else if (rVar.d()) {
                hashSet3.add(rVar.c());
            } else if (rVar.g()) {
                hashSet5.add(rVar.c());
            } else {
                hashSet2.add(rVar.c());
            }
        }
        if (!c5807c.k().isEmpty()) {
            hashSet.add(B.b(E4.c.class));
        }
        this.f36015a = DesugarCollections.unmodifiableSet(hashSet);
        this.f36016b = DesugarCollections.unmodifiableSet(hashSet2);
        this.f36017c = DesugarCollections.unmodifiableSet(hashSet3);
        this.f36018d = DesugarCollections.unmodifiableSet(hashSet4);
        this.f36019e = DesugarCollections.unmodifiableSet(hashSet5);
        this.f36020f = c5807c.k();
        this.f36021g = eVar;
    }

    @Override // g4.e
    public Object a(Class cls) {
        if (!this.f36015a.contains(B.b(cls))) {
            throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        Object a8 = this.f36021g.a(cls);
        return !cls.equals(E4.c.class) ? a8 : new a(this.f36020f, (E4.c) a8);
    }

    @Override // g4.e
    public Set b(B b8) {
        if (this.f36018d.contains(b8)) {
            return this.f36021g.b(b8);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", b8));
    }

    @Override // g4.e
    public H4.b c(B b8) {
        if (this.f36016b.contains(b8)) {
            return this.f36021g.c(b8);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", b8));
    }

    @Override // g4.e
    public H4.b d(Class cls) {
        return c(B.b(cls));
    }

    @Override // g4.e
    public H4.a e(B b8) {
        if (this.f36017c.contains(b8)) {
            return this.f36021g.e(b8);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Deferred<%s>.", b8));
    }

    @Override // g4.e
    public Object f(B b8) {
        if (this.f36015a.contains(b8)) {
            return this.f36021g.f(b8);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", b8));
    }

    @Override // g4.e
    public /* synthetic */ Set g(Class cls) {
        return d.f(this, cls);
    }

    @Override // g4.e
    public H4.b h(B b8) {
        if (this.f36019e.contains(b8)) {
            return this.f36021g.h(b8);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", b8));
    }

    @Override // g4.e
    public H4.a i(Class cls) {
        return e(B.b(cls));
    }
}
