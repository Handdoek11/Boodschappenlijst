package p4;

import p4.AbstractC6384F;

/* renamed from: p4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6386a implements B4.a {

    /* renamed from: a, reason: collision with root package name */
    public static final B4.a f40429a = new C6386a();

    /* renamed from: p4.a$a, reason: collision with other inner class name */
    private static final class C0320a implements A4.c {

        /* renamed from: a, reason: collision with root package name */
        static final C0320a f40430a = new C0320a();

        /* renamed from: b, reason: collision with root package name */
        private static final A4.b f40431b = A4.b.d("arch");

        /* renamed from: c, reason: collision with root package name */
        private static final A4.b f40432c = A4.b.d("libraryName");

        /* renamed from: d, reason: collision with root package name */
        private static final A4.b f40433d = A4.b.d("buildId");

        private C0320a() {
        }

        @Override // A4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC6384F.a.AbstractC0302a abstractC0302a, A4.d dVar) {
            dVar.a(f40431b, abstractC0302a.b());
            dVar.a(f40432c, abstractC0302a.d());
            dVar.a(f40433d, abstractC0302a.c());
        }
    }

    /* renamed from: p4.a$b */
    private static final class b implements A4.c {

        /* renamed from: a, reason: collision with root package name */
        static final b f40434a = new b();

        /* renamed from: b, reason: collision with root package name */
        private static final A4.b f40435b = A4.b.d("pid");

        /* renamed from: c, reason: collision with root package name */
        private static final A4.b f40436c = A4.b.d("processName");

        /* renamed from: d, reason: collision with root package name */
        private static final A4.b f40437d = A4.b.d("reasonCode");

        /* renamed from: e, reason: collision with root package name */
        private static final A4.b f40438e = A4.b.d("importance");

        /* renamed from: f, reason: collision with root package name */
        private static final A4.b f40439f = A4.b.d("pss");

        /* renamed from: g, reason: collision with root package name */
        private static final A4.b f40440g = A4.b.d("rss");

        /* renamed from: h, reason: collision with root package name */
        private static final A4.b f40441h = A4.b.d("timestamp");

        /* renamed from: i, reason: collision with root package name */
        private static final A4.b f40442i = A4.b.d("traceFile");

        /* renamed from: j, reason: collision with root package name */
        private static final A4.b f40443j = A4.b.d("buildIdMappingForArch");

        private b() {
        }

        @Override // A4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC6384F.a aVar, A4.d dVar) {
            dVar.e(f40435b, aVar.d());
            dVar.a(f40436c, aVar.e());
            dVar.e(f40437d, aVar.g());
            dVar.e(f40438e, aVar.c());
            dVar.f(f40439f, aVar.f());
            dVar.f(f40440g, aVar.h());
            dVar.f(f40441h, aVar.i());
            dVar.a(f40442i, aVar.j());
            dVar.a(f40443j, aVar.b());
        }
    }

    /* renamed from: p4.a$c */
    private static final class c implements A4.c {

        /* renamed from: a, reason: collision with root package name */
        static final c f40444a = new c();

        /* renamed from: b, reason: collision with root package name */
        private static final A4.b f40445b = A4.b.d("key");

        /* renamed from: c, reason: collision with root package name */
        private static final A4.b f40446c = A4.b.d("value");

        private c() {
        }

        @Override // A4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC6384F.c cVar, A4.d dVar) {
            dVar.a(f40445b, cVar.b());
            dVar.a(f40446c, cVar.c());
        }
    }

    /* renamed from: p4.a$d */
    private static final class d implements A4.c {

        /* renamed from: a, reason: collision with root package name */
        static final d f40447a = new d();

        /* renamed from: b, reason: collision with root package name */
        private static final A4.b f40448b = A4.b.d("sdkVersion");

        /* renamed from: c, reason: collision with root package name */
        private static final A4.b f40449c = A4.b.d("gmpAppId");

        /* renamed from: d, reason: collision with root package name */
        private static final A4.b f40450d = A4.b.d("platform");

        /* renamed from: e, reason: collision with root package name */
        private static final A4.b f40451e = A4.b.d("installationUuid");

        /* renamed from: f, reason: collision with root package name */
        private static final A4.b f40452f = A4.b.d("firebaseInstallationId");

        /* renamed from: g, reason: collision with root package name */
        private static final A4.b f40453g = A4.b.d("firebaseAuthenticationToken");

        /* renamed from: h, reason: collision with root package name */
        private static final A4.b f40454h = A4.b.d("appQualitySessionId");

        /* renamed from: i, reason: collision with root package name */
        private static final A4.b f40455i = A4.b.d("buildVersion");

        /* renamed from: j, reason: collision with root package name */
        private static final A4.b f40456j = A4.b.d("displayVersion");

        /* renamed from: k, reason: collision with root package name */
        private static final A4.b f40457k = A4.b.d("session");

        /* renamed from: l, reason: collision with root package name */
        private static final A4.b f40458l = A4.b.d("ndkPayload");

        /* renamed from: m, reason: collision with root package name */
        private static final A4.b f40459m = A4.b.d("appExitInfo");

        private d() {
        }

        @Override // A4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC6384F abstractC6384F, A4.d dVar) {
            dVar.a(f40448b, abstractC6384F.m());
            dVar.a(f40449c, abstractC6384F.i());
            dVar.e(f40450d, abstractC6384F.l());
            dVar.a(f40451e, abstractC6384F.j());
            dVar.a(f40452f, abstractC6384F.h());
            dVar.a(f40453g, abstractC6384F.g());
            dVar.a(f40454h, abstractC6384F.d());
            dVar.a(f40455i, abstractC6384F.e());
            dVar.a(f40456j, abstractC6384F.f());
            dVar.a(f40457k, abstractC6384F.n());
            dVar.a(f40458l, abstractC6384F.k());
            dVar.a(f40459m, abstractC6384F.c());
        }
    }

    /* renamed from: p4.a$e */
    private static final class e implements A4.c {

        /* renamed from: a, reason: collision with root package name */
        static final e f40460a = new e();

        /* renamed from: b, reason: collision with root package name */
        private static final A4.b f40461b = A4.b.d("files");

        /* renamed from: c, reason: collision with root package name */
        private static final A4.b f40462c = A4.b.d("orgId");

        private e() {
        }

        @Override // A4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC6384F.d dVar, A4.d dVar2) {
            dVar2.a(f40461b, dVar.b());
            dVar2.a(f40462c, dVar.c());
        }
    }

    /* renamed from: p4.a$f */
    private static final class f implements A4.c {

        /* renamed from: a, reason: collision with root package name */
        static final f f40463a = new f();

        /* renamed from: b, reason: collision with root package name */
        private static final A4.b f40464b = A4.b.d("filename");

        /* renamed from: c, reason: collision with root package name */
        private static final A4.b f40465c = A4.b.d("contents");

        private f() {
        }

        @Override // A4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC6384F.d.b bVar, A4.d dVar) {
            dVar.a(f40464b, bVar.c());
            dVar.a(f40465c, bVar.b());
        }
    }

    /* renamed from: p4.a$g */
    private static final class g implements A4.c {

        /* renamed from: a, reason: collision with root package name */
        static final g f40466a = new g();

        /* renamed from: b, reason: collision with root package name */
        private static final A4.b f40467b = A4.b.d("identifier");

        /* renamed from: c, reason: collision with root package name */
        private static final A4.b f40468c = A4.b.d("version");

        /* renamed from: d, reason: collision with root package name */
        private static final A4.b f40469d = A4.b.d("displayVersion");

        /* renamed from: e, reason: collision with root package name */
        private static final A4.b f40470e = A4.b.d("organization");

        /* renamed from: f, reason: collision with root package name */
        private static final A4.b f40471f = A4.b.d("installationUuid");

        /* renamed from: g, reason: collision with root package name */
        private static final A4.b f40472g = A4.b.d("developmentPlatform");

        /* renamed from: h, reason: collision with root package name */
        private static final A4.b f40473h = A4.b.d("developmentPlatformVersion");

        private g() {
        }

        @Override // A4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC6384F.e.a aVar, A4.d dVar) {
            dVar.a(f40467b, aVar.e());
            dVar.a(f40468c, aVar.h());
            dVar.a(f40469d, aVar.d());
            A4.b bVar = f40470e;
            aVar.g();
            dVar.a(bVar, null);
            dVar.a(f40471f, aVar.f());
            dVar.a(f40472g, aVar.b());
            dVar.a(f40473h, aVar.c());
        }
    }

    /* renamed from: p4.a$h */
    private static final class h implements A4.c {

        /* renamed from: a, reason: collision with root package name */
        static final h f40474a = new h();

        /* renamed from: b, reason: collision with root package name */
        private static final A4.b f40475b = A4.b.d("clsId");

        private h() {
        }

        @Override // A4.c
        public /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
            androidx.appcompat.app.E.a(obj);
            b(null, (A4.d) obj2);
        }

        public void b(AbstractC6384F.e.a.b bVar, A4.d dVar) {
            throw null;
        }
    }

    /* renamed from: p4.a$i */
    private static final class i implements A4.c {

        /* renamed from: a, reason: collision with root package name */
        static final i f40476a = new i();

        /* renamed from: b, reason: collision with root package name */
        private static final A4.b f40477b = A4.b.d("arch");

        /* renamed from: c, reason: collision with root package name */
        private static final A4.b f40478c = A4.b.d("model");

        /* renamed from: d, reason: collision with root package name */
        private static final A4.b f40479d = A4.b.d("cores");

        /* renamed from: e, reason: collision with root package name */
        private static final A4.b f40480e = A4.b.d("ram");

        /* renamed from: f, reason: collision with root package name */
        private static final A4.b f40481f = A4.b.d("diskSpace");

        /* renamed from: g, reason: collision with root package name */
        private static final A4.b f40482g = A4.b.d("simulator");

        /* renamed from: h, reason: collision with root package name */
        private static final A4.b f40483h = A4.b.d("state");

        /* renamed from: i, reason: collision with root package name */
        private static final A4.b f40484i = A4.b.d("manufacturer");

        /* renamed from: j, reason: collision with root package name */
        private static final A4.b f40485j = A4.b.d("modelClass");

        private i() {
        }

        @Override // A4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC6384F.e.c cVar, A4.d dVar) {
            dVar.e(f40477b, cVar.b());
            dVar.a(f40478c, cVar.f());
            dVar.e(f40479d, cVar.c());
            dVar.f(f40480e, cVar.h());
            dVar.f(f40481f, cVar.d());
            dVar.g(f40482g, cVar.j());
            dVar.e(f40483h, cVar.i());
            dVar.a(f40484i, cVar.e());
            dVar.a(f40485j, cVar.g());
        }
    }

    /* renamed from: p4.a$j */
    private static final class j implements A4.c {

        /* renamed from: a, reason: collision with root package name */
        static final j f40486a = new j();

        /* renamed from: b, reason: collision with root package name */
        private static final A4.b f40487b = A4.b.d("generator");

        /* renamed from: c, reason: collision with root package name */
        private static final A4.b f40488c = A4.b.d("identifier");

        /* renamed from: d, reason: collision with root package name */
        private static final A4.b f40489d = A4.b.d("appQualitySessionId");

        /* renamed from: e, reason: collision with root package name */
        private static final A4.b f40490e = A4.b.d("startedAt");

        /* renamed from: f, reason: collision with root package name */
        private static final A4.b f40491f = A4.b.d("endedAt");

        /* renamed from: g, reason: collision with root package name */
        private static final A4.b f40492g = A4.b.d("crashed");

        /* renamed from: h, reason: collision with root package name */
        private static final A4.b f40493h = A4.b.d("app");

        /* renamed from: i, reason: collision with root package name */
        private static final A4.b f40494i = A4.b.d("user");

        /* renamed from: j, reason: collision with root package name */
        private static final A4.b f40495j = A4.b.d("os");

        /* renamed from: k, reason: collision with root package name */
        private static final A4.b f40496k = A4.b.d("device");

        /* renamed from: l, reason: collision with root package name */
        private static final A4.b f40497l = A4.b.d("events");

        /* renamed from: m, reason: collision with root package name */
        private static final A4.b f40498m = A4.b.d("generatorType");

        private j() {
        }

        @Override // A4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC6384F.e eVar, A4.d dVar) {
            dVar.a(f40487b, eVar.g());
            dVar.a(f40488c, eVar.j());
            dVar.a(f40489d, eVar.c());
            dVar.f(f40490e, eVar.l());
            dVar.a(f40491f, eVar.e());
            dVar.g(f40492g, eVar.n());
            dVar.a(f40493h, eVar.b());
            dVar.a(f40494i, eVar.m());
            dVar.a(f40495j, eVar.k());
            dVar.a(f40496k, eVar.d());
            dVar.a(f40497l, eVar.f());
            dVar.e(f40498m, eVar.h());
        }
    }

    /* renamed from: p4.a$k */
    private static final class k implements A4.c {

        /* renamed from: a, reason: collision with root package name */
        static final k f40499a = new k();

        /* renamed from: b, reason: collision with root package name */
        private static final A4.b f40500b = A4.b.d("execution");

        /* renamed from: c, reason: collision with root package name */
        private static final A4.b f40501c = A4.b.d("customAttributes");

        /* renamed from: d, reason: collision with root package name */
        private static final A4.b f40502d = A4.b.d("internalKeys");

        /* renamed from: e, reason: collision with root package name */
        private static final A4.b f40503e = A4.b.d("background");

        /* renamed from: f, reason: collision with root package name */
        private static final A4.b f40504f = A4.b.d("currentProcessDetails");

        /* renamed from: g, reason: collision with root package name */
        private static final A4.b f40505g = A4.b.d("appProcessDetails");

        /* renamed from: h, reason: collision with root package name */
        private static final A4.b f40506h = A4.b.d("uiOrientation");

        private k() {
        }

        @Override // A4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC6384F.e.d.a aVar, A4.d dVar) {
            dVar.a(f40500b, aVar.f());
            dVar.a(f40501c, aVar.e());
            dVar.a(f40502d, aVar.g());
            dVar.a(f40503e, aVar.c());
            dVar.a(f40504f, aVar.d());
            dVar.a(f40505g, aVar.b());
            dVar.e(f40506h, aVar.h());
        }
    }

    /* renamed from: p4.a$l */
    private static final class l implements A4.c {

        /* renamed from: a, reason: collision with root package name */
        static final l f40507a = new l();

        /* renamed from: b, reason: collision with root package name */
        private static final A4.b f40508b = A4.b.d("baseAddress");

        /* renamed from: c, reason: collision with root package name */
        private static final A4.b f40509c = A4.b.d("size");

        /* renamed from: d, reason: collision with root package name */
        private static final A4.b f40510d = A4.b.d("name");

        /* renamed from: e, reason: collision with root package name */
        private static final A4.b f40511e = A4.b.d("uuid");

        private l() {
        }

        @Override // A4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC6384F.e.d.a.b.AbstractC0306a abstractC0306a, A4.d dVar) {
            dVar.f(f40508b, abstractC0306a.b());
            dVar.f(f40509c, abstractC0306a.d());
            dVar.a(f40510d, abstractC0306a.c());
            dVar.a(f40511e, abstractC0306a.f());
        }
    }

    /* renamed from: p4.a$m */
    private static final class m implements A4.c {

        /* renamed from: a, reason: collision with root package name */
        static final m f40512a = new m();

        /* renamed from: b, reason: collision with root package name */
        private static final A4.b f40513b = A4.b.d("threads");

        /* renamed from: c, reason: collision with root package name */
        private static final A4.b f40514c = A4.b.d("exception");

        /* renamed from: d, reason: collision with root package name */
        private static final A4.b f40515d = A4.b.d("appExitInfo");

        /* renamed from: e, reason: collision with root package name */
        private static final A4.b f40516e = A4.b.d("signal");

        /* renamed from: f, reason: collision with root package name */
        private static final A4.b f40517f = A4.b.d("binaries");

        private m() {
        }

        @Override // A4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC6384F.e.d.a.b bVar, A4.d dVar) {
            dVar.a(f40513b, bVar.f());
            dVar.a(f40514c, bVar.d());
            dVar.a(f40515d, bVar.b());
            dVar.a(f40516e, bVar.e());
            dVar.a(f40517f, bVar.c());
        }
    }

    /* renamed from: p4.a$n */
    private static final class n implements A4.c {

        /* renamed from: a, reason: collision with root package name */
        static final n f40518a = new n();

        /* renamed from: b, reason: collision with root package name */
        private static final A4.b f40519b = A4.b.d("type");

        /* renamed from: c, reason: collision with root package name */
        private static final A4.b f40520c = A4.b.d("reason");

        /* renamed from: d, reason: collision with root package name */
        private static final A4.b f40521d = A4.b.d("frames");

        /* renamed from: e, reason: collision with root package name */
        private static final A4.b f40522e = A4.b.d("causedBy");

        /* renamed from: f, reason: collision with root package name */
        private static final A4.b f40523f = A4.b.d("overflowCount");

        private n() {
        }

        @Override // A4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC6384F.e.d.a.b.c cVar, A4.d dVar) {
            dVar.a(f40519b, cVar.f());
            dVar.a(f40520c, cVar.e());
            dVar.a(f40521d, cVar.c());
            dVar.a(f40522e, cVar.b());
            dVar.e(f40523f, cVar.d());
        }
    }

    /* renamed from: p4.a$o */
    private static final class o implements A4.c {

        /* renamed from: a, reason: collision with root package name */
        static final o f40524a = new o();

        /* renamed from: b, reason: collision with root package name */
        private static final A4.b f40525b = A4.b.d("name");

        /* renamed from: c, reason: collision with root package name */
        private static final A4.b f40526c = A4.b.d("code");

        /* renamed from: d, reason: collision with root package name */
        private static final A4.b f40527d = A4.b.d("address");

        private o() {
        }

        @Override // A4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC6384F.e.d.a.b.AbstractC0310d abstractC0310d, A4.d dVar) {
            dVar.a(f40525b, abstractC0310d.d());
            dVar.a(f40526c, abstractC0310d.c());
            dVar.f(f40527d, abstractC0310d.b());
        }
    }

    /* renamed from: p4.a$p */
    private static final class p implements A4.c {

        /* renamed from: a, reason: collision with root package name */
        static final p f40528a = new p();

        /* renamed from: b, reason: collision with root package name */
        private static final A4.b f40529b = A4.b.d("name");

        /* renamed from: c, reason: collision with root package name */
        private static final A4.b f40530c = A4.b.d("importance");

        /* renamed from: d, reason: collision with root package name */
        private static final A4.b f40531d = A4.b.d("frames");

        private p() {
        }

        @Override // A4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC6384F.e.d.a.b.AbstractC0312e abstractC0312e, A4.d dVar) {
            dVar.a(f40529b, abstractC0312e.d());
            dVar.e(f40530c, abstractC0312e.c());
            dVar.a(f40531d, abstractC0312e.b());
        }
    }

    /* renamed from: p4.a$q */
    private static final class q implements A4.c {

        /* renamed from: a, reason: collision with root package name */
        static final q f40532a = new q();

        /* renamed from: b, reason: collision with root package name */
        private static final A4.b f40533b = A4.b.d("pc");

        /* renamed from: c, reason: collision with root package name */
        private static final A4.b f40534c = A4.b.d("symbol");

        /* renamed from: d, reason: collision with root package name */
        private static final A4.b f40535d = A4.b.d("file");

        /* renamed from: e, reason: collision with root package name */
        private static final A4.b f40536e = A4.b.d("offset");

        /* renamed from: f, reason: collision with root package name */
        private static final A4.b f40537f = A4.b.d("importance");

        private q() {
        }

        @Override // A4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC6384F.e.d.a.b.AbstractC0312e.AbstractC0314b abstractC0314b, A4.d dVar) {
            dVar.f(f40533b, abstractC0314b.e());
            dVar.a(f40534c, abstractC0314b.f());
            dVar.a(f40535d, abstractC0314b.b());
            dVar.f(f40536e, abstractC0314b.d());
            dVar.e(f40537f, abstractC0314b.c());
        }
    }

    /* renamed from: p4.a$r */
    private static final class r implements A4.c {

        /* renamed from: a, reason: collision with root package name */
        static final r f40538a = new r();

        /* renamed from: b, reason: collision with root package name */
        private static final A4.b f40539b = A4.b.d("processName");

        /* renamed from: c, reason: collision with root package name */
        private static final A4.b f40540c = A4.b.d("pid");

        /* renamed from: d, reason: collision with root package name */
        private static final A4.b f40541d = A4.b.d("importance");

        /* renamed from: e, reason: collision with root package name */
        private static final A4.b f40542e = A4.b.d("defaultProcess");

        private r() {
        }

        @Override // A4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC6384F.e.d.a.c cVar, A4.d dVar) {
            dVar.a(f40539b, cVar.d());
            dVar.e(f40540c, cVar.c());
            dVar.e(f40541d, cVar.b());
            dVar.g(f40542e, cVar.e());
        }
    }

    /* renamed from: p4.a$s */
    private static final class s implements A4.c {

        /* renamed from: a, reason: collision with root package name */
        static final s f40543a = new s();

        /* renamed from: b, reason: collision with root package name */
        private static final A4.b f40544b = A4.b.d("batteryLevel");

        /* renamed from: c, reason: collision with root package name */
        private static final A4.b f40545c = A4.b.d("batteryVelocity");

        /* renamed from: d, reason: collision with root package name */
        private static final A4.b f40546d = A4.b.d("proximityOn");

        /* renamed from: e, reason: collision with root package name */
        private static final A4.b f40547e = A4.b.d("orientation");

        /* renamed from: f, reason: collision with root package name */
        private static final A4.b f40548f = A4.b.d("ramUsed");

        /* renamed from: g, reason: collision with root package name */
        private static final A4.b f40549g = A4.b.d("diskUsed");

        private s() {
        }

        @Override // A4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC6384F.e.d.c cVar, A4.d dVar) {
            dVar.a(f40544b, cVar.b());
            dVar.e(f40545c, cVar.c());
            dVar.g(f40546d, cVar.g());
            dVar.e(f40547e, cVar.e());
            dVar.f(f40548f, cVar.f());
            dVar.f(f40549g, cVar.d());
        }
    }

    /* renamed from: p4.a$t */
    private static final class t implements A4.c {

        /* renamed from: a, reason: collision with root package name */
        static final t f40550a = new t();

        /* renamed from: b, reason: collision with root package name */
        private static final A4.b f40551b = A4.b.d("timestamp");

        /* renamed from: c, reason: collision with root package name */
        private static final A4.b f40552c = A4.b.d("type");

        /* renamed from: d, reason: collision with root package name */
        private static final A4.b f40553d = A4.b.d("app");

        /* renamed from: e, reason: collision with root package name */
        private static final A4.b f40554e = A4.b.d("device");

        /* renamed from: f, reason: collision with root package name */
        private static final A4.b f40555f = A4.b.d("log");

        /* renamed from: g, reason: collision with root package name */
        private static final A4.b f40556g = A4.b.d("rollouts");

        private t() {
        }

        @Override // A4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC6384F.e.d dVar, A4.d dVar2) {
            dVar2.f(f40551b, dVar.f());
            dVar2.a(f40552c, dVar.g());
            dVar2.a(f40553d, dVar.b());
            dVar2.a(f40554e, dVar.c());
            dVar2.a(f40555f, dVar.d());
            dVar2.a(f40556g, dVar.e());
        }
    }

    /* renamed from: p4.a$u */
    private static final class u implements A4.c {

        /* renamed from: a, reason: collision with root package name */
        static final u f40557a = new u();

        /* renamed from: b, reason: collision with root package name */
        private static final A4.b f40558b = A4.b.d("content");

        private u() {
        }

        @Override // A4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC6384F.e.d.AbstractC0317d abstractC0317d, A4.d dVar) {
            dVar.a(f40558b, abstractC0317d.b());
        }
    }

    /* renamed from: p4.a$v */
    private static final class v implements A4.c {

        /* renamed from: a, reason: collision with root package name */
        static final v f40559a = new v();

        /* renamed from: b, reason: collision with root package name */
        private static final A4.b f40560b = A4.b.d("rolloutVariant");

        /* renamed from: c, reason: collision with root package name */
        private static final A4.b f40561c = A4.b.d("parameterKey");

        /* renamed from: d, reason: collision with root package name */
        private static final A4.b f40562d = A4.b.d("parameterValue");

        /* renamed from: e, reason: collision with root package name */
        private static final A4.b f40563e = A4.b.d("templateVersion");

        private v() {
        }

        @Override // A4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC6384F.e.d.AbstractC0318e abstractC0318e, A4.d dVar) {
            dVar.a(f40560b, abstractC0318e.d());
            dVar.a(f40561c, abstractC0318e.b());
            dVar.a(f40562d, abstractC0318e.c());
            dVar.f(f40563e, abstractC0318e.e());
        }
    }

    /* renamed from: p4.a$w */
    private static final class w implements A4.c {

        /* renamed from: a, reason: collision with root package name */
        static final w f40564a = new w();

        /* renamed from: b, reason: collision with root package name */
        private static final A4.b f40565b = A4.b.d("rolloutId");

        /* renamed from: c, reason: collision with root package name */
        private static final A4.b f40566c = A4.b.d("variantId");

        private w() {
        }

        @Override // A4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC6384F.e.d.AbstractC0318e.b bVar, A4.d dVar) {
            dVar.a(f40565b, bVar.b());
            dVar.a(f40566c, bVar.c());
        }
    }

    /* renamed from: p4.a$x */
    private static final class x implements A4.c {

        /* renamed from: a, reason: collision with root package name */
        static final x f40567a = new x();

        /* renamed from: b, reason: collision with root package name */
        private static final A4.b f40568b = A4.b.d("assignments");

        private x() {
        }

        @Override // A4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC6384F.e.d.f fVar, A4.d dVar) {
            dVar.a(f40568b, fVar.b());
        }
    }

    /* renamed from: p4.a$y */
    private static final class y implements A4.c {

        /* renamed from: a, reason: collision with root package name */
        static final y f40569a = new y();

        /* renamed from: b, reason: collision with root package name */
        private static final A4.b f40570b = A4.b.d("platform");

        /* renamed from: c, reason: collision with root package name */
        private static final A4.b f40571c = A4.b.d("version");

        /* renamed from: d, reason: collision with root package name */
        private static final A4.b f40572d = A4.b.d("buildVersion");

        /* renamed from: e, reason: collision with root package name */
        private static final A4.b f40573e = A4.b.d("jailbroken");

        private y() {
        }

        @Override // A4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC6384F.e.AbstractC0319e abstractC0319e, A4.d dVar) {
            dVar.e(f40570b, abstractC0319e.c());
            dVar.a(f40571c, abstractC0319e.d());
            dVar.a(f40572d, abstractC0319e.b());
            dVar.g(f40573e, abstractC0319e.e());
        }
    }

    /* renamed from: p4.a$z */
    private static final class z implements A4.c {

        /* renamed from: a, reason: collision with root package name */
        static final z f40574a = new z();

        /* renamed from: b, reason: collision with root package name */
        private static final A4.b f40575b = A4.b.d("identifier");

        private z() {
        }

        @Override // A4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC6384F.e.f fVar, A4.d dVar) {
            dVar.a(f40575b, fVar.b());
        }
    }

    private C6386a() {
    }

    @Override // B4.a
    public void a(B4.b bVar) {
        d dVar = d.f40447a;
        bVar.a(AbstractC6384F.class, dVar);
        bVar.a(C6387b.class, dVar);
        j jVar = j.f40486a;
        bVar.a(AbstractC6384F.e.class, jVar);
        bVar.a(C6393h.class, jVar);
        g gVar = g.f40466a;
        bVar.a(AbstractC6384F.e.a.class, gVar);
        bVar.a(C6394i.class, gVar);
        h hVar = h.f40474a;
        bVar.a(AbstractC6384F.e.a.b.class, hVar);
        bVar.a(p4.j.class, hVar);
        z zVar = z.f40574a;
        bVar.a(AbstractC6384F.e.f.class, zVar);
        bVar.a(C6379A.class, zVar);
        y yVar = y.f40569a;
        bVar.a(AbstractC6384F.e.AbstractC0319e.class, yVar);
        bVar.a(p4.z.class, yVar);
        i iVar = i.f40476a;
        bVar.a(AbstractC6384F.e.c.class, iVar);
        bVar.a(p4.k.class, iVar);
        t tVar = t.f40550a;
        bVar.a(AbstractC6384F.e.d.class, tVar);
        bVar.a(p4.l.class, tVar);
        k kVar = k.f40499a;
        bVar.a(AbstractC6384F.e.d.a.class, kVar);
        bVar.a(p4.m.class, kVar);
        m mVar = m.f40512a;
        bVar.a(AbstractC6384F.e.d.a.b.class, mVar);
        bVar.a(p4.n.class, mVar);
        p pVar = p.f40528a;
        bVar.a(AbstractC6384F.e.d.a.b.AbstractC0312e.class, pVar);
        bVar.a(p4.r.class, pVar);
        q qVar = q.f40532a;
        bVar.a(AbstractC6384F.e.d.a.b.AbstractC0312e.AbstractC0314b.class, qVar);
        bVar.a(p4.s.class, qVar);
        n nVar = n.f40518a;
        bVar.a(AbstractC6384F.e.d.a.b.c.class, nVar);
        bVar.a(p4.p.class, nVar);
        b bVar2 = b.f40434a;
        bVar.a(AbstractC6384F.a.class, bVar2);
        bVar.a(C6388c.class, bVar2);
        C0320a c0320a = C0320a.f40430a;
        bVar.a(AbstractC6384F.a.AbstractC0302a.class, c0320a);
        bVar.a(C6389d.class, c0320a);
        o oVar = o.f40524a;
        bVar.a(AbstractC6384F.e.d.a.b.AbstractC0310d.class, oVar);
        bVar.a(p4.q.class, oVar);
        l lVar = l.f40507a;
        bVar.a(AbstractC6384F.e.d.a.b.AbstractC0306a.class, lVar);
        bVar.a(p4.o.class, lVar);
        c cVar = c.f40444a;
        bVar.a(AbstractC6384F.c.class, cVar);
        bVar.a(C6390e.class, cVar);
        r rVar = r.f40538a;
        bVar.a(AbstractC6384F.e.d.a.c.class, rVar);
        bVar.a(p4.t.class, rVar);
        s sVar = s.f40543a;
        bVar.a(AbstractC6384F.e.d.c.class, sVar);
        bVar.a(p4.u.class, sVar);
        u uVar = u.f40557a;
        bVar.a(AbstractC6384F.e.d.AbstractC0317d.class, uVar);
        bVar.a(p4.v.class, uVar);
        x xVar = x.f40567a;
        bVar.a(AbstractC6384F.e.d.f.class, xVar);
        bVar.a(p4.y.class, xVar);
        v vVar = v.f40559a;
        bVar.a(AbstractC6384F.e.d.AbstractC0318e.class, vVar);
        bVar.a(p4.w.class, vVar);
        w wVar = w.f40564a;
        bVar.a(AbstractC6384F.e.d.AbstractC0318e.b.class, wVar);
        bVar.a(p4.x.class, wVar);
        e eVar = e.f40460a;
        bVar.a(AbstractC6384F.d.class, eVar);
        bVar.a(C6391f.class, eVar);
        f fVar = f.f40463a;
        bVar.a(AbstractC6384F.d.b.class, fVar);
        bVar.a(C6392g.class, fVar);
    }
}
