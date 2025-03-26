package androidx.work;

import android.net.Network;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import s1.f;
import s1.o;
import s1.v;

/* loaded from: classes.dex */
public final class WorkerParameters {

    /* renamed from: a, reason: collision with root package name */
    private UUID f11782a;

    /* renamed from: b, reason: collision with root package name */
    private b f11783b;

    /* renamed from: c, reason: collision with root package name */
    private Set f11784c;

    /* renamed from: d, reason: collision with root package name */
    private a f11785d;

    /* renamed from: e, reason: collision with root package name */
    private int f11786e;

    /* renamed from: f, reason: collision with root package name */
    private Executor f11787f;

    /* renamed from: g, reason: collision with root package name */
    private C1.a f11788g;

    /* renamed from: h, reason: collision with root package name */
    private v f11789h;

    /* renamed from: i, reason: collision with root package name */
    private o f11790i;

    /* renamed from: j, reason: collision with root package name */
    private f f11791j;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public List f11792a = Collections.emptyList();

        /* renamed from: b, reason: collision with root package name */
        public List f11793b = Collections.emptyList();

        /* renamed from: c, reason: collision with root package name */
        public Network f11794c;
    }

    public WorkerParameters(UUID uuid, b bVar, Collection collection, a aVar, int i8, Executor executor, C1.a aVar2, v vVar, o oVar, f fVar) {
        this.f11782a = uuid;
        this.f11783b = bVar;
        this.f11784c = new HashSet(collection);
        this.f11785d = aVar;
        this.f11786e = i8;
        this.f11787f = executor;
        this.f11788g = aVar2;
        this.f11789h = vVar;
        this.f11790i = oVar;
        this.f11791j = fVar;
    }

    public Executor a() {
        return this.f11787f;
    }

    public f b() {
        return this.f11791j;
    }

    public UUID c() {
        return this.f11782a;
    }

    public b d() {
        return this.f11783b;
    }

    public Network e() {
        return this.f11785d.f11794c;
    }

    public o f() {
        return this.f11790i;
    }

    public int g() {
        return this.f11786e;
    }

    public Set h() {
        return this.f11784c;
    }

    public C1.a i() {
        return this.f11788g;
    }

    public List j() {
        return this.f11785d.f11792a;
    }

    public List k() {
        return this.f11785d.f11793b;
    }

    public v l() {
        return this.f11789h;
    }
}
