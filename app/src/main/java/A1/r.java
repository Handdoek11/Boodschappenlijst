package A1;

import A1.p;
import android.database.Cursor;
import c1.AbstractC0975a;
import e1.AbstractC5737b;
import e1.AbstractC5738c;
import e1.AbstractC5740e;
import java.util.ArrayList;
import java.util.List;
import s1.C6722b;

/* loaded from: classes.dex */
public final class r implements q {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.room.h f115a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC0975a f116b;

    /* renamed from: c, reason: collision with root package name */
    private final c1.d f117c;

    /* renamed from: d, reason: collision with root package name */
    private final c1.d f118d;

    /* renamed from: e, reason: collision with root package name */
    private final c1.d f119e;

    /* renamed from: f, reason: collision with root package name */
    private final c1.d f120f;

    /* renamed from: g, reason: collision with root package name */
    private final c1.d f121g;

    /* renamed from: h, reason: collision with root package name */
    private final c1.d f122h;

    /* renamed from: i, reason: collision with root package name */
    private final c1.d f123i;

    /* renamed from: j, reason: collision with root package name */
    private final c1.d f124j;

    class a extends AbstractC0975a {
        a(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // c1.d
        public String d() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // c1.AbstractC0975a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(g1.f fVar, p pVar) {
            String str = pVar.f95a;
            if (str == null) {
                fVar.f0(1);
            } else {
                fVar.w(1, str);
            }
            fVar.O(2, v.j(pVar.f96b));
            String str2 = pVar.f97c;
            if (str2 == null) {
                fVar.f0(3);
            } else {
                fVar.w(3, str2);
            }
            String str3 = pVar.f98d;
            if (str3 == null) {
                fVar.f0(4);
            } else {
                fVar.w(4, str3);
            }
            byte[] k8 = androidx.work.b.k(pVar.f99e);
            if (k8 == null) {
                fVar.f0(5);
            } else {
                fVar.R(5, k8);
            }
            byte[] k9 = androidx.work.b.k(pVar.f100f);
            if (k9 == null) {
                fVar.f0(6);
            } else {
                fVar.R(6, k9);
            }
            fVar.O(7, pVar.f101g);
            fVar.O(8, pVar.f102h);
            fVar.O(9, pVar.f103i);
            fVar.O(10, pVar.f105k);
            fVar.O(11, v.a(pVar.f106l));
            fVar.O(12, pVar.f107m);
            fVar.O(13, pVar.f108n);
            fVar.O(14, pVar.f109o);
            fVar.O(15, pVar.f110p);
            fVar.O(16, pVar.f111q ? 1L : 0L);
            fVar.O(17, v.i(pVar.f112r));
            C6722b c6722b = pVar.f104j;
            if (c6722b == null) {
                fVar.f0(18);
                fVar.f0(19);
                fVar.f0(20);
                fVar.f0(21);
                fVar.f0(22);
                fVar.f0(23);
                fVar.f0(24);
                fVar.f0(25);
                return;
            }
            fVar.O(18, v.h(c6722b.b()));
            fVar.O(19, c6722b.g() ? 1L : 0L);
            fVar.O(20, c6722b.h() ? 1L : 0L);
            fVar.O(21, c6722b.f() ? 1L : 0L);
            fVar.O(22, c6722b.i() ? 1L : 0L);
            fVar.O(23, c6722b.c());
            fVar.O(24, c6722b.d());
            byte[] c8 = v.c(c6722b.a());
            if (c8 == null) {
                fVar.f0(25);
            } else {
                fVar.R(25, c8);
            }
        }
    }

    class b extends c1.d {
        b(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // c1.d
        public String d() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    class c extends c1.d {
        c(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // c1.d
        public String d() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    class d extends c1.d {
        d(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // c1.d
        public String d() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    class e extends c1.d {
        e(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // c1.d
        public String d() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    class f extends c1.d {
        f(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // c1.d
        public String d() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    class g extends c1.d {
        g(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // c1.d
        public String d() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    class h extends c1.d {
        h(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // c1.d
        public String d() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    class i extends c1.d {
        i(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // c1.d
        public String d() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public r(androidx.room.h hVar) {
        this.f115a = hVar;
        this.f116b = new a(hVar);
        this.f117c = new b(hVar);
        this.f118d = new c(hVar);
        this.f119e = new d(hVar);
        this.f120f = new e(hVar);
        this.f121g = new f(hVar);
        this.f122h = new g(hVar);
        this.f123i = new h(hVar);
        this.f124j = new i(hVar);
    }

    @Override // A1.q
    public void a(String str) {
        this.f115a.b();
        g1.f a8 = this.f117c.a();
        if (str == null) {
            a8.f0(1);
        } else {
            a8.w(1, str);
        }
        this.f115a.c();
        try {
            a8.x();
            this.f115a.r();
        } finally {
            this.f115a.g();
            this.f117c.f(a8);
        }
    }

    @Override // A1.q
    public void b(p pVar) {
        this.f115a.b();
        this.f115a.c();
        try {
            this.f116b.h(pVar);
            this.f115a.r();
        } finally {
            this.f115a.g();
        }
    }

    @Override // A1.q
    public int c(String str, long j8) {
        this.f115a.b();
        g1.f a8 = this.f122h.a();
        a8.O(1, j8);
        if (str == null) {
            a8.f0(2);
        } else {
            a8.w(2, str);
        }
        this.f115a.c();
        try {
            int x7 = a8.x();
            this.f115a.r();
            return x7;
        } finally {
            this.f115a.g();
            this.f122h.f(a8);
        }
    }

    @Override // A1.q
    public List d(String str) {
        c1.c f8 = c1.c.f("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            f8.f0(1);
        } else {
            f8.w(1, str);
        }
        this.f115a.b();
        Cursor b8 = AbstractC5738c.b(this.f115a, f8, false, null);
        try {
            int b9 = AbstractC5737b.b(b8, "id");
            int b10 = AbstractC5737b.b(b8, "state");
            ArrayList arrayList = new ArrayList(b8.getCount());
            while (b8.moveToNext()) {
                p.b bVar = new p.b();
                bVar.f113a = b8.getString(b9);
                bVar.f114b = v.g(b8.getInt(b10));
                arrayList.add(bVar);
            }
            return arrayList;
        } finally {
            b8.close();
            f8.i();
        }
    }

    @Override // A1.q
    public List e(long j8) {
        c1.c cVar;
        int b8;
        int b9;
        int b10;
        int b11;
        int b12;
        int b13;
        int b14;
        int b15;
        int b16;
        int b17;
        int b18;
        int b19;
        int b20;
        int b21;
        c1.c f8 = c1.c.f("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        f8.O(1, j8);
        this.f115a.b();
        Cursor b22 = AbstractC5738c.b(this.f115a, f8, false, null);
        try {
            b8 = AbstractC5737b.b(b22, "required_network_type");
            b9 = AbstractC5737b.b(b22, "requires_charging");
            b10 = AbstractC5737b.b(b22, "requires_device_idle");
            b11 = AbstractC5737b.b(b22, "requires_battery_not_low");
            b12 = AbstractC5737b.b(b22, "requires_storage_not_low");
            b13 = AbstractC5737b.b(b22, "trigger_content_update_delay");
            b14 = AbstractC5737b.b(b22, "trigger_max_content_delay");
            b15 = AbstractC5737b.b(b22, "content_uri_triggers");
            b16 = AbstractC5737b.b(b22, "id");
            b17 = AbstractC5737b.b(b22, "state");
            b18 = AbstractC5737b.b(b22, "worker_class_name");
            b19 = AbstractC5737b.b(b22, "input_merger_class_name");
            b20 = AbstractC5737b.b(b22, "input");
            b21 = AbstractC5737b.b(b22, "output");
            cVar = f8;
        } catch (Throwable th) {
            th = th;
            cVar = f8;
        }
        try {
            int b23 = AbstractC5737b.b(b22, "initial_delay");
            int b24 = AbstractC5737b.b(b22, "interval_duration");
            int b25 = AbstractC5737b.b(b22, "flex_duration");
            int b26 = AbstractC5737b.b(b22, "run_attempt_count");
            int b27 = AbstractC5737b.b(b22, "backoff_policy");
            int b28 = AbstractC5737b.b(b22, "backoff_delay_duration");
            int b29 = AbstractC5737b.b(b22, "period_start_time");
            int b30 = AbstractC5737b.b(b22, "minimum_retention_duration");
            int b31 = AbstractC5737b.b(b22, "schedule_requested_at");
            int b32 = AbstractC5737b.b(b22, "run_in_foreground");
            int b33 = AbstractC5737b.b(b22, "out_of_quota_policy");
            int i8 = b21;
            ArrayList arrayList = new ArrayList(b22.getCount());
            while (b22.moveToNext()) {
                String string = b22.getString(b16);
                int i9 = b16;
                String string2 = b22.getString(b18);
                int i10 = b18;
                C6722b c6722b = new C6722b();
                int i11 = b8;
                c6722b.k(v.e(b22.getInt(b8)));
                c6722b.m(b22.getInt(b9) != 0);
                c6722b.n(b22.getInt(b10) != 0);
                c6722b.l(b22.getInt(b11) != 0);
                c6722b.o(b22.getInt(b12) != 0);
                int i12 = b9;
                int i13 = b10;
                c6722b.p(b22.getLong(b13));
                c6722b.q(b22.getLong(b14));
                c6722b.j(v.b(b22.getBlob(b15)));
                p pVar = new p(string, string2);
                pVar.f96b = v.g(b22.getInt(b17));
                pVar.f98d = b22.getString(b19);
                pVar.f99e = androidx.work.b.g(b22.getBlob(b20));
                int i14 = i8;
                pVar.f100f = androidx.work.b.g(b22.getBlob(i14));
                int i15 = b23;
                i8 = i14;
                pVar.f101g = b22.getLong(i15);
                int i16 = b19;
                int i17 = b24;
                pVar.f102h = b22.getLong(i17);
                int i18 = b11;
                int i19 = b25;
                pVar.f103i = b22.getLong(i19);
                int i20 = b26;
                pVar.f105k = b22.getInt(i20);
                int i21 = b27;
                pVar.f106l = v.d(b22.getInt(i21));
                b25 = i19;
                int i22 = b28;
                pVar.f107m = b22.getLong(i22);
                int i23 = b29;
                pVar.f108n = b22.getLong(i23);
                b29 = i23;
                int i24 = b30;
                pVar.f109o = b22.getLong(i24);
                int i25 = b31;
                pVar.f110p = b22.getLong(i25);
                int i26 = b32;
                pVar.f111q = b22.getInt(i26) != 0;
                int i27 = b33;
                pVar.f112r = v.f(b22.getInt(i27));
                pVar.f104j = c6722b;
                arrayList.add(pVar);
                b9 = i12;
                b33 = i27;
                b19 = i16;
                b23 = i15;
                b24 = i17;
                b26 = i20;
                b31 = i25;
                b16 = i9;
                b18 = i10;
                b8 = i11;
                b32 = i26;
                b30 = i24;
                b10 = i13;
                b28 = i22;
                b11 = i18;
                b27 = i21;
            }
            b22.close();
            cVar.i();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            b22.close();
            cVar.i();
            throw th;
        }
    }

    @Override // A1.q
    public List f(int i8) {
        c1.c cVar;
        int b8;
        int b9;
        int b10;
        int b11;
        int b12;
        int b13;
        int b14;
        int b15;
        int b16;
        int b17;
        int b18;
        int b19;
        int b20;
        int b21;
        c1.c f8 = c1.c.f("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        f8.O(1, i8);
        this.f115a.b();
        Cursor b22 = AbstractC5738c.b(this.f115a, f8, false, null);
        try {
            b8 = AbstractC5737b.b(b22, "required_network_type");
            b9 = AbstractC5737b.b(b22, "requires_charging");
            b10 = AbstractC5737b.b(b22, "requires_device_idle");
            b11 = AbstractC5737b.b(b22, "requires_battery_not_low");
            b12 = AbstractC5737b.b(b22, "requires_storage_not_low");
            b13 = AbstractC5737b.b(b22, "trigger_content_update_delay");
            b14 = AbstractC5737b.b(b22, "trigger_max_content_delay");
            b15 = AbstractC5737b.b(b22, "content_uri_triggers");
            b16 = AbstractC5737b.b(b22, "id");
            b17 = AbstractC5737b.b(b22, "state");
            b18 = AbstractC5737b.b(b22, "worker_class_name");
            b19 = AbstractC5737b.b(b22, "input_merger_class_name");
            b20 = AbstractC5737b.b(b22, "input");
            b21 = AbstractC5737b.b(b22, "output");
            cVar = f8;
        } catch (Throwable th) {
            th = th;
            cVar = f8;
        }
        try {
            int b23 = AbstractC5737b.b(b22, "initial_delay");
            int b24 = AbstractC5737b.b(b22, "interval_duration");
            int b25 = AbstractC5737b.b(b22, "flex_duration");
            int b26 = AbstractC5737b.b(b22, "run_attempt_count");
            int b27 = AbstractC5737b.b(b22, "backoff_policy");
            int b28 = AbstractC5737b.b(b22, "backoff_delay_duration");
            int b29 = AbstractC5737b.b(b22, "period_start_time");
            int b30 = AbstractC5737b.b(b22, "minimum_retention_duration");
            int b31 = AbstractC5737b.b(b22, "schedule_requested_at");
            int b32 = AbstractC5737b.b(b22, "run_in_foreground");
            int b33 = AbstractC5737b.b(b22, "out_of_quota_policy");
            int i9 = b21;
            ArrayList arrayList = new ArrayList(b22.getCount());
            while (b22.moveToNext()) {
                String string = b22.getString(b16);
                int i10 = b16;
                String string2 = b22.getString(b18);
                int i11 = b18;
                C6722b c6722b = new C6722b();
                int i12 = b8;
                c6722b.k(v.e(b22.getInt(b8)));
                c6722b.m(b22.getInt(b9) != 0);
                c6722b.n(b22.getInt(b10) != 0);
                c6722b.l(b22.getInt(b11) != 0);
                c6722b.o(b22.getInt(b12) != 0);
                int i13 = b9;
                int i14 = b10;
                c6722b.p(b22.getLong(b13));
                c6722b.q(b22.getLong(b14));
                c6722b.j(v.b(b22.getBlob(b15)));
                p pVar = new p(string, string2);
                pVar.f96b = v.g(b22.getInt(b17));
                pVar.f98d = b22.getString(b19);
                pVar.f99e = androidx.work.b.g(b22.getBlob(b20));
                int i15 = i9;
                pVar.f100f = androidx.work.b.g(b22.getBlob(i15));
                i9 = i15;
                int i16 = b23;
                pVar.f101g = b22.getLong(i16);
                int i17 = b19;
                int i18 = b24;
                pVar.f102h = b22.getLong(i18);
                int i19 = b11;
                int i20 = b25;
                pVar.f103i = b22.getLong(i20);
                int i21 = b26;
                pVar.f105k = b22.getInt(i21);
                int i22 = b27;
                pVar.f106l = v.d(b22.getInt(i22));
                b25 = i20;
                int i23 = b28;
                pVar.f107m = b22.getLong(i23);
                int i24 = b29;
                pVar.f108n = b22.getLong(i24);
                b29 = i24;
                int i25 = b30;
                pVar.f109o = b22.getLong(i25);
                int i26 = b31;
                pVar.f110p = b22.getLong(i26);
                int i27 = b32;
                pVar.f111q = b22.getInt(i27) != 0;
                int i28 = b33;
                pVar.f112r = v.f(b22.getInt(i28));
                pVar.f104j = c6722b;
                arrayList.add(pVar);
                b33 = i28;
                b9 = i13;
                b19 = i17;
                b23 = i16;
                b24 = i18;
                b26 = i21;
                b31 = i26;
                b16 = i10;
                b18 = i11;
                b8 = i12;
                b32 = i27;
                b30 = i25;
                b10 = i14;
                b28 = i23;
                b11 = i19;
                b27 = i22;
            }
            b22.close();
            cVar.i();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            b22.close();
            cVar.i();
            throw th;
        }
    }

    @Override // A1.q
    public List g() {
        c1.c cVar;
        int b8;
        int b9;
        int b10;
        int b11;
        int b12;
        int b13;
        int b14;
        int b15;
        int b16;
        int b17;
        int b18;
        int b19;
        int b20;
        int b21;
        c1.c f8 = c1.c.f("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f115a.b();
        Cursor b22 = AbstractC5738c.b(this.f115a, f8, false, null);
        try {
            b8 = AbstractC5737b.b(b22, "required_network_type");
            b9 = AbstractC5737b.b(b22, "requires_charging");
            b10 = AbstractC5737b.b(b22, "requires_device_idle");
            b11 = AbstractC5737b.b(b22, "requires_battery_not_low");
            b12 = AbstractC5737b.b(b22, "requires_storage_not_low");
            b13 = AbstractC5737b.b(b22, "trigger_content_update_delay");
            b14 = AbstractC5737b.b(b22, "trigger_max_content_delay");
            b15 = AbstractC5737b.b(b22, "content_uri_triggers");
            b16 = AbstractC5737b.b(b22, "id");
            b17 = AbstractC5737b.b(b22, "state");
            b18 = AbstractC5737b.b(b22, "worker_class_name");
            b19 = AbstractC5737b.b(b22, "input_merger_class_name");
            b20 = AbstractC5737b.b(b22, "input");
            b21 = AbstractC5737b.b(b22, "output");
            cVar = f8;
        } catch (Throwable th) {
            th = th;
            cVar = f8;
        }
        try {
            int b23 = AbstractC5737b.b(b22, "initial_delay");
            int b24 = AbstractC5737b.b(b22, "interval_duration");
            int b25 = AbstractC5737b.b(b22, "flex_duration");
            int b26 = AbstractC5737b.b(b22, "run_attempt_count");
            int b27 = AbstractC5737b.b(b22, "backoff_policy");
            int b28 = AbstractC5737b.b(b22, "backoff_delay_duration");
            int b29 = AbstractC5737b.b(b22, "period_start_time");
            int b30 = AbstractC5737b.b(b22, "minimum_retention_duration");
            int b31 = AbstractC5737b.b(b22, "schedule_requested_at");
            int b32 = AbstractC5737b.b(b22, "run_in_foreground");
            int b33 = AbstractC5737b.b(b22, "out_of_quota_policy");
            int i8 = b21;
            ArrayList arrayList = new ArrayList(b22.getCount());
            while (b22.moveToNext()) {
                String string = b22.getString(b16);
                int i9 = b16;
                String string2 = b22.getString(b18);
                int i10 = b18;
                C6722b c6722b = new C6722b();
                int i11 = b8;
                c6722b.k(v.e(b22.getInt(b8)));
                c6722b.m(b22.getInt(b9) != 0);
                c6722b.n(b22.getInt(b10) != 0);
                c6722b.l(b22.getInt(b11) != 0);
                c6722b.o(b22.getInt(b12) != 0);
                int i12 = b9;
                int i13 = b10;
                c6722b.p(b22.getLong(b13));
                c6722b.q(b22.getLong(b14));
                c6722b.j(v.b(b22.getBlob(b15)));
                p pVar = new p(string, string2);
                pVar.f96b = v.g(b22.getInt(b17));
                pVar.f98d = b22.getString(b19);
                pVar.f99e = androidx.work.b.g(b22.getBlob(b20));
                int i14 = i8;
                pVar.f100f = androidx.work.b.g(b22.getBlob(i14));
                i8 = i14;
                int i15 = b23;
                pVar.f101g = b22.getLong(i15);
                int i16 = b20;
                int i17 = b24;
                pVar.f102h = b22.getLong(i17);
                int i18 = b11;
                int i19 = b25;
                pVar.f103i = b22.getLong(i19);
                int i20 = b26;
                pVar.f105k = b22.getInt(i20);
                int i21 = b27;
                pVar.f106l = v.d(b22.getInt(i21));
                b25 = i19;
                int i22 = b28;
                pVar.f107m = b22.getLong(i22);
                int i23 = b29;
                pVar.f108n = b22.getLong(i23);
                b29 = i23;
                int i24 = b30;
                pVar.f109o = b22.getLong(i24);
                int i25 = b31;
                pVar.f110p = b22.getLong(i25);
                int i26 = b32;
                pVar.f111q = b22.getInt(i26) != 0;
                int i27 = b33;
                pVar.f112r = v.f(b22.getInt(i27));
                pVar.f104j = c6722b;
                arrayList.add(pVar);
                b33 = i27;
                b9 = i12;
                b20 = i16;
                b23 = i15;
                b24 = i17;
                b26 = i20;
                b31 = i25;
                b16 = i9;
                b18 = i10;
                b8 = i11;
                b32 = i26;
                b30 = i24;
                b10 = i13;
                b28 = i22;
                b11 = i18;
                b27 = i21;
            }
            b22.close();
            cVar.i();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            b22.close();
            cVar.i();
            throw th;
        }
    }

    @Override // A1.q
    public void h(String str, androidx.work.b bVar) {
        this.f115a.b();
        g1.f a8 = this.f118d.a();
        byte[] k8 = androidx.work.b.k(bVar);
        if (k8 == null) {
            a8.f0(1);
        } else {
            a8.R(1, k8);
        }
        if (str == null) {
            a8.f0(2);
        } else {
            a8.w(2, str);
        }
        this.f115a.c();
        try {
            a8.x();
            this.f115a.r();
        } finally {
            this.f115a.g();
            this.f118d.f(a8);
        }
    }

    @Override // A1.q
    public List i() {
        c1.c cVar;
        int b8;
        int b9;
        int b10;
        int b11;
        int b12;
        int b13;
        int b14;
        int b15;
        int b16;
        int b17;
        int b18;
        int b19;
        int b20;
        int b21;
        c1.c f8 = c1.c.f("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        this.f115a.b();
        Cursor b22 = AbstractC5738c.b(this.f115a, f8, false, null);
        try {
            b8 = AbstractC5737b.b(b22, "required_network_type");
            b9 = AbstractC5737b.b(b22, "requires_charging");
            b10 = AbstractC5737b.b(b22, "requires_device_idle");
            b11 = AbstractC5737b.b(b22, "requires_battery_not_low");
            b12 = AbstractC5737b.b(b22, "requires_storage_not_low");
            b13 = AbstractC5737b.b(b22, "trigger_content_update_delay");
            b14 = AbstractC5737b.b(b22, "trigger_max_content_delay");
            b15 = AbstractC5737b.b(b22, "content_uri_triggers");
            b16 = AbstractC5737b.b(b22, "id");
            b17 = AbstractC5737b.b(b22, "state");
            b18 = AbstractC5737b.b(b22, "worker_class_name");
            b19 = AbstractC5737b.b(b22, "input_merger_class_name");
            b20 = AbstractC5737b.b(b22, "input");
            b21 = AbstractC5737b.b(b22, "output");
            cVar = f8;
        } catch (Throwable th) {
            th = th;
            cVar = f8;
        }
        try {
            int b23 = AbstractC5737b.b(b22, "initial_delay");
            int b24 = AbstractC5737b.b(b22, "interval_duration");
            int b25 = AbstractC5737b.b(b22, "flex_duration");
            int b26 = AbstractC5737b.b(b22, "run_attempt_count");
            int b27 = AbstractC5737b.b(b22, "backoff_policy");
            int b28 = AbstractC5737b.b(b22, "backoff_delay_duration");
            int b29 = AbstractC5737b.b(b22, "period_start_time");
            int b30 = AbstractC5737b.b(b22, "minimum_retention_duration");
            int b31 = AbstractC5737b.b(b22, "schedule_requested_at");
            int b32 = AbstractC5737b.b(b22, "run_in_foreground");
            int b33 = AbstractC5737b.b(b22, "out_of_quota_policy");
            int i8 = b21;
            ArrayList arrayList = new ArrayList(b22.getCount());
            while (b22.moveToNext()) {
                String string = b22.getString(b16);
                int i9 = b16;
                String string2 = b22.getString(b18);
                int i10 = b18;
                C6722b c6722b = new C6722b();
                int i11 = b8;
                c6722b.k(v.e(b22.getInt(b8)));
                c6722b.m(b22.getInt(b9) != 0);
                c6722b.n(b22.getInt(b10) != 0);
                c6722b.l(b22.getInt(b11) != 0);
                c6722b.o(b22.getInt(b12) != 0);
                int i12 = b9;
                int i13 = b10;
                c6722b.p(b22.getLong(b13));
                c6722b.q(b22.getLong(b14));
                c6722b.j(v.b(b22.getBlob(b15)));
                p pVar = new p(string, string2);
                pVar.f96b = v.g(b22.getInt(b17));
                pVar.f98d = b22.getString(b19);
                pVar.f99e = androidx.work.b.g(b22.getBlob(b20));
                int i14 = i8;
                pVar.f100f = androidx.work.b.g(b22.getBlob(i14));
                i8 = i14;
                int i15 = b23;
                pVar.f101g = b22.getLong(i15);
                int i16 = b20;
                int i17 = b24;
                pVar.f102h = b22.getLong(i17);
                int i18 = b11;
                int i19 = b25;
                pVar.f103i = b22.getLong(i19);
                int i20 = b26;
                pVar.f105k = b22.getInt(i20);
                int i21 = b27;
                pVar.f106l = v.d(b22.getInt(i21));
                b25 = i19;
                int i22 = b28;
                pVar.f107m = b22.getLong(i22);
                int i23 = b29;
                pVar.f108n = b22.getLong(i23);
                b29 = i23;
                int i24 = b30;
                pVar.f109o = b22.getLong(i24);
                int i25 = b31;
                pVar.f110p = b22.getLong(i25);
                int i26 = b32;
                pVar.f111q = b22.getInt(i26) != 0;
                int i27 = b33;
                pVar.f112r = v.f(b22.getInt(i27));
                pVar.f104j = c6722b;
                arrayList.add(pVar);
                b33 = i27;
                b9 = i12;
                b20 = i16;
                b23 = i15;
                b24 = i17;
                b26 = i20;
                b31 = i25;
                b16 = i9;
                b18 = i10;
                b8 = i11;
                b32 = i26;
                b30 = i24;
                b10 = i13;
                b28 = i22;
                b11 = i18;
                b27 = i21;
            }
            b22.close();
            cVar.i();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            b22.close();
            cVar.i();
            throw th;
        }
    }

    @Override // A1.q
    public boolean j() {
        boolean z7 = false;
        c1.c f8 = c1.c.f("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.f115a.b();
        Cursor b8 = AbstractC5738c.b(this.f115a, f8, false, null);
        try {
            if (b8.moveToFirst()) {
                if (b8.getInt(0) != 0) {
                    z7 = true;
                }
            }
            return z7;
        } finally {
            b8.close();
            f8.i();
        }
    }

    @Override // A1.q
    public List k(String str) {
        c1.c f8 = c1.c.f("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            f8.f0(1);
        } else {
            f8.w(1, str);
        }
        this.f115a.b();
        Cursor b8 = AbstractC5738c.b(this.f115a, f8, false, null);
        try {
            ArrayList arrayList = new ArrayList(b8.getCount());
            while (b8.moveToNext()) {
                arrayList.add(b8.getString(0));
            }
            return arrayList;
        } finally {
            b8.close();
            f8.i();
        }
    }

    @Override // A1.q
    public s1.s l(String str) {
        c1.c f8 = c1.c.f("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            f8.f0(1);
        } else {
            f8.w(1, str);
        }
        this.f115a.b();
        Cursor b8 = AbstractC5738c.b(this.f115a, f8, false, null);
        try {
            return b8.moveToFirst() ? v.g(b8.getInt(0)) : null;
        } finally {
            b8.close();
            f8.i();
        }
    }

    @Override // A1.q
    public p m(String str) {
        c1.c cVar;
        p pVar;
        c1.c f8 = c1.c.f("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (str == null) {
            f8.f0(1);
        } else {
            f8.w(1, str);
        }
        this.f115a.b();
        Cursor b8 = AbstractC5738c.b(this.f115a, f8, false, null);
        try {
            int b9 = AbstractC5737b.b(b8, "required_network_type");
            int b10 = AbstractC5737b.b(b8, "requires_charging");
            int b11 = AbstractC5737b.b(b8, "requires_device_idle");
            int b12 = AbstractC5737b.b(b8, "requires_battery_not_low");
            int b13 = AbstractC5737b.b(b8, "requires_storage_not_low");
            int b14 = AbstractC5737b.b(b8, "trigger_content_update_delay");
            int b15 = AbstractC5737b.b(b8, "trigger_max_content_delay");
            int b16 = AbstractC5737b.b(b8, "content_uri_triggers");
            int b17 = AbstractC5737b.b(b8, "id");
            int b18 = AbstractC5737b.b(b8, "state");
            int b19 = AbstractC5737b.b(b8, "worker_class_name");
            int b20 = AbstractC5737b.b(b8, "input_merger_class_name");
            int b21 = AbstractC5737b.b(b8, "input");
            int b22 = AbstractC5737b.b(b8, "output");
            cVar = f8;
            try {
                int b23 = AbstractC5737b.b(b8, "initial_delay");
                int b24 = AbstractC5737b.b(b8, "interval_duration");
                int b25 = AbstractC5737b.b(b8, "flex_duration");
                int b26 = AbstractC5737b.b(b8, "run_attempt_count");
                int b27 = AbstractC5737b.b(b8, "backoff_policy");
                int b28 = AbstractC5737b.b(b8, "backoff_delay_duration");
                int b29 = AbstractC5737b.b(b8, "period_start_time");
                int b30 = AbstractC5737b.b(b8, "minimum_retention_duration");
                int b31 = AbstractC5737b.b(b8, "schedule_requested_at");
                int b32 = AbstractC5737b.b(b8, "run_in_foreground");
                int b33 = AbstractC5737b.b(b8, "out_of_quota_policy");
                if (b8.moveToFirst()) {
                    String string = b8.getString(b17);
                    String string2 = b8.getString(b19);
                    C6722b c6722b = new C6722b();
                    c6722b.k(v.e(b8.getInt(b9)));
                    c6722b.m(b8.getInt(b10) != 0);
                    c6722b.n(b8.getInt(b11) != 0);
                    c6722b.l(b8.getInt(b12) != 0);
                    c6722b.o(b8.getInt(b13) != 0);
                    c6722b.p(b8.getLong(b14));
                    c6722b.q(b8.getLong(b15));
                    c6722b.j(v.b(b8.getBlob(b16)));
                    p pVar2 = new p(string, string2);
                    pVar2.f96b = v.g(b8.getInt(b18));
                    pVar2.f98d = b8.getString(b20);
                    pVar2.f99e = androidx.work.b.g(b8.getBlob(b21));
                    pVar2.f100f = androidx.work.b.g(b8.getBlob(b22));
                    pVar2.f101g = b8.getLong(b23);
                    pVar2.f102h = b8.getLong(b24);
                    pVar2.f103i = b8.getLong(b25);
                    pVar2.f105k = b8.getInt(b26);
                    pVar2.f106l = v.d(b8.getInt(b27));
                    pVar2.f107m = b8.getLong(b28);
                    pVar2.f108n = b8.getLong(b29);
                    pVar2.f109o = b8.getLong(b30);
                    pVar2.f110p = b8.getLong(b31);
                    pVar2.f111q = b8.getInt(b32) != 0;
                    pVar2.f112r = v.f(b8.getInt(b33));
                    pVar2.f104j = c6722b;
                    pVar = pVar2;
                } else {
                    pVar = null;
                }
                b8.close();
                cVar.i();
                return pVar;
            } catch (Throwable th) {
                th = th;
                b8.close();
                cVar.i();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cVar = f8;
        }
    }

    @Override // A1.q
    public int n(String str) {
        this.f115a.b();
        g1.f a8 = this.f121g.a();
        if (str == null) {
            a8.f0(1);
        } else {
            a8.w(1, str);
        }
        this.f115a.c();
        try {
            int x7 = a8.x();
            this.f115a.r();
            return x7;
        } finally {
            this.f115a.g();
            this.f121g.f(a8);
        }
    }

    @Override // A1.q
    public List o(String str) {
        c1.c f8 = c1.c.f("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            f8.f0(1);
        } else {
            f8.w(1, str);
        }
        this.f115a.b();
        Cursor b8 = AbstractC5738c.b(this.f115a, f8, false, null);
        try {
            ArrayList arrayList = new ArrayList(b8.getCount());
            while (b8.moveToNext()) {
                arrayList.add(b8.getString(0));
            }
            return arrayList;
        } finally {
            b8.close();
            f8.i();
        }
    }

    @Override // A1.q
    public List p(String str) {
        c1.c f8 = c1.c.f("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            f8.f0(1);
        } else {
            f8.w(1, str);
        }
        this.f115a.b();
        Cursor b8 = AbstractC5738c.b(this.f115a, f8, false, null);
        try {
            ArrayList arrayList = new ArrayList(b8.getCount());
            while (b8.moveToNext()) {
                arrayList.add(androidx.work.b.g(b8.getBlob(0)));
            }
            return arrayList;
        } finally {
            b8.close();
            f8.i();
        }
    }

    @Override // A1.q
    public int q(String str) {
        this.f115a.b();
        g1.f a8 = this.f120f.a();
        if (str == null) {
            a8.f0(1);
        } else {
            a8.w(1, str);
        }
        this.f115a.c();
        try {
            int x7 = a8.x();
            this.f115a.r();
            return x7;
        } finally {
            this.f115a.g();
            this.f120f.f(a8);
        }
    }

    @Override // A1.q
    public void r(String str, long j8) {
        this.f115a.b();
        g1.f a8 = this.f119e.a();
        a8.O(1, j8);
        if (str == null) {
            a8.f0(2);
        } else {
            a8.w(2, str);
        }
        this.f115a.c();
        try {
            a8.x();
            this.f115a.r();
        } finally {
            this.f115a.g();
            this.f119e.f(a8);
        }
    }

    @Override // A1.q
    public List s(int i8) {
        c1.c cVar;
        int b8;
        int b9;
        int b10;
        int b11;
        int b12;
        int b13;
        int b14;
        int b15;
        int b16;
        int b17;
        int b18;
        int b19;
        int b20;
        int b21;
        c1.c f8 = c1.c.f("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        f8.O(1, i8);
        this.f115a.b();
        Cursor b22 = AbstractC5738c.b(this.f115a, f8, false, null);
        try {
            b8 = AbstractC5737b.b(b22, "required_network_type");
            b9 = AbstractC5737b.b(b22, "requires_charging");
            b10 = AbstractC5737b.b(b22, "requires_device_idle");
            b11 = AbstractC5737b.b(b22, "requires_battery_not_low");
            b12 = AbstractC5737b.b(b22, "requires_storage_not_low");
            b13 = AbstractC5737b.b(b22, "trigger_content_update_delay");
            b14 = AbstractC5737b.b(b22, "trigger_max_content_delay");
            b15 = AbstractC5737b.b(b22, "content_uri_triggers");
            b16 = AbstractC5737b.b(b22, "id");
            b17 = AbstractC5737b.b(b22, "state");
            b18 = AbstractC5737b.b(b22, "worker_class_name");
            b19 = AbstractC5737b.b(b22, "input_merger_class_name");
            b20 = AbstractC5737b.b(b22, "input");
            b21 = AbstractC5737b.b(b22, "output");
            cVar = f8;
        } catch (Throwable th) {
            th = th;
            cVar = f8;
        }
        try {
            int b23 = AbstractC5737b.b(b22, "initial_delay");
            int b24 = AbstractC5737b.b(b22, "interval_duration");
            int b25 = AbstractC5737b.b(b22, "flex_duration");
            int b26 = AbstractC5737b.b(b22, "run_attempt_count");
            int b27 = AbstractC5737b.b(b22, "backoff_policy");
            int b28 = AbstractC5737b.b(b22, "backoff_delay_duration");
            int b29 = AbstractC5737b.b(b22, "period_start_time");
            int b30 = AbstractC5737b.b(b22, "minimum_retention_duration");
            int b31 = AbstractC5737b.b(b22, "schedule_requested_at");
            int b32 = AbstractC5737b.b(b22, "run_in_foreground");
            int b33 = AbstractC5737b.b(b22, "out_of_quota_policy");
            int i9 = b21;
            ArrayList arrayList = new ArrayList(b22.getCount());
            while (b22.moveToNext()) {
                String string = b22.getString(b16);
                int i10 = b16;
                String string2 = b22.getString(b18);
                int i11 = b18;
                C6722b c6722b = new C6722b();
                int i12 = b8;
                c6722b.k(v.e(b22.getInt(b8)));
                c6722b.m(b22.getInt(b9) != 0);
                c6722b.n(b22.getInt(b10) != 0);
                c6722b.l(b22.getInt(b11) != 0);
                c6722b.o(b22.getInt(b12) != 0);
                int i13 = b9;
                int i14 = b10;
                c6722b.p(b22.getLong(b13));
                c6722b.q(b22.getLong(b14));
                c6722b.j(v.b(b22.getBlob(b15)));
                p pVar = new p(string, string2);
                pVar.f96b = v.g(b22.getInt(b17));
                pVar.f98d = b22.getString(b19);
                pVar.f99e = androidx.work.b.g(b22.getBlob(b20));
                int i15 = i9;
                pVar.f100f = androidx.work.b.g(b22.getBlob(i15));
                i9 = i15;
                int i16 = b23;
                pVar.f101g = b22.getLong(i16);
                int i17 = b19;
                int i18 = b24;
                pVar.f102h = b22.getLong(i18);
                int i19 = b11;
                int i20 = b25;
                pVar.f103i = b22.getLong(i20);
                int i21 = b26;
                pVar.f105k = b22.getInt(i21);
                int i22 = b27;
                pVar.f106l = v.d(b22.getInt(i22));
                b25 = i20;
                int i23 = b28;
                pVar.f107m = b22.getLong(i23);
                int i24 = b29;
                pVar.f108n = b22.getLong(i24);
                b29 = i24;
                int i25 = b30;
                pVar.f109o = b22.getLong(i25);
                int i26 = b31;
                pVar.f110p = b22.getLong(i26);
                int i27 = b32;
                pVar.f111q = b22.getInt(i27) != 0;
                int i28 = b33;
                pVar.f112r = v.f(b22.getInt(i28));
                pVar.f104j = c6722b;
                arrayList.add(pVar);
                b33 = i28;
                b9 = i13;
                b19 = i17;
                b23 = i16;
                b24 = i18;
                b26 = i21;
                b31 = i26;
                b16 = i10;
                b18 = i11;
                b8 = i12;
                b32 = i27;
                b30 = i25;
                b10 = i14;
                b28 = i23;
                b11 = i19;
                b27 = i22;
            }
            b22.close();
            cVar.i();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            b22.close();
            cVar.i();
            throw th;
        }
    }

    @Override // A1.q
    public int t() {
        this.f115a.b();
        g1.f a8 = this.f123i.a();
        this.f115a.c();
        try {
            int x7 = a8.x();
            this.f115a.r();
            return x7;
        } finally {
            this.f115a.g();
            this.f123i.f(a8);
        }
    }

    @Override // A1.q
    public int u(s1.s sVar, String... strArr) {
        this.f115a.b();
        StringBuilder b8 = AbstractC5740e.b();
        b8.append("UPDATE workspec SET state=");
        b8.append("?");
        b8.append(" WHERE id IN (");
        AbstractC5740e.a(b8, strArr.length);
        b8.append(")");
        g1.f d8 = this.f115a.d(b8.toString());
        d8.O(1, v.j(sVar));
        int i8 = 2;
        for (String str : strArr) {
            if (str == null) {
                d8.f0(i8);
            } else {
                d8.w(i8, str);
            }
            i8++;
        }
        this.f115a.c();
        try {
            int x7 = d8.x();
            this.f115a.r();
            return x7;
        } finally {
            this.f115a.g();
        }
    }
}
