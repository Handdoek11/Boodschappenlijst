package androidx.work.impl;

import A1.b;
import A1.e;
import A1.f;
import A1.h;
import A1.k;
import A1.l;
import A1.n;
import A1.o;
import A1.q;
import A1.r;
import A1.t;
import A1.u;
import androidx.room.h;
import androidx.room.i;
import e1.AbstractC5738c;
import e1.C5741f;
import g1.c;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: m, reason: collision with root package name */
    private volatile q f11825m;

    /* renamed from: n, reason: collision with root package name */
    private volatile b f11826n;

    /* renamed from: o, reason: collision with root package name */
    private volatile t f11827o;

    /* renamed from: p, reason: collision with root package name */
    private volatile h f11828p;

    /* renamed from: q, reason: collision with root package name */
    private volatile k f11829q;

    /* renamed from: r, reason: collision with root package name */
    private volatile n f11830r;

    /* renamed from: s, reason: collision with root package name */
    private volatile e f11831s;

    @Override // androidx.work.impl.WorkDatabase
    public n A() {
        n nVar;
        if (this.f11830r != null) {
            return this.f11830r;
        }
        synchronized (this) {
            try {
                if (this.f11830r == null) {
                    this.f11830r = new o(this);
                }
                nVar = this.f11830r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return nVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public q B() {
        q qVar;
        if (this.f11825m != null) {
            return this.f11825m;
        }
        synchronized (this) {
            try {
                if (this.f11825m == null) {
                    this.f11825m = new r(this);
                }
                qVar = this.f11825m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public t C() {
        t tVar;
        if (this.f11827o != null) {
            return this.f11827o;
        }
        synchronized (this) {
            try {
                if (this.f11827o == null) {
                    this.f11827o = new u(this);
                }
                tVar = this.f11827o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tVar;
    }

    @Override // androidx.room.h
    protected androidx.room.e e() {
        return new androidx.room.e(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.room.h
    protected c f(androidx.room.a aVar) {
        return aVar.f11293a.a(c.b.a(aVar.f11294b).c(aVar.f11295c).b(new i(aVar, new a(12), "c103703e120ae8cc73c9248622f3cd1e", "49f946663a8deb7054212b8adda248c6")).a());
    }

    @Override // androidx.work.impl.WorkDatabase
    public b t() {
        b bVar;
        if (this.f11826n != null) {
            return this.f11826n;
        }
        synchronized (this) {
            try {
                if (this.f11826n == null) {
                    this.f11826n = new A1.c(this);
                }
                bVar = this.f11826n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public e x() {
        e eVar;
        if (this.f11831s != null) {
            return this.f11831s;
        }
        synchronized (this) {
            try {
                if (this.f11831s == null) {
                    this.f11831s = new f(this);
                }
                eVar = this.f11831s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public h y() {
        h hVar;
        if (this.f11828p != null) {
            return this.f11828p;
        }
        synchronized (this) {
            try {
                if (this.f11828p == null) {
                    this.f11828p = new A1.i(this);
                }
                hVar = this.f11828p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public k z() {
        k kVar;
        if (this.f11829q != null) {
            return this.f11829q;
        }
        synchronized (this) {
            try {
                if (this.f11829q == null) {
                    this.f11829q = new l(this);
                }
                kVar = this.f11829q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return kVar;
    }

    class a extends i.a {
        a(int i8) {
            super(i8);
        }

        @Override // androidx.room.i.a
        public void a(g1.b bVar) {
            bVar.v("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.v("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            bVar.v("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            bVar.v("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            bVar.v("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            bVar.v("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
            bVar.v("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.v("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            bVar.v("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.v("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.v("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            bVar.v("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.v("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            bVar.v("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            bVar.v("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
        }

        @Override // androidx.room.i.a
        public void b(g1.b bVar) {
            bVar.v("DROP TABLE IF EXISTS `Dependency`");
            bVar.v("DROP TABLE IF EXISTS `WorkSpec`");
            bVar.v("DROP TABLE IF EXISTS `WorkTag`");
            bVar.v("DROP TABLE IF EXISTS `SystemIdInfo`");
            bVar.v("DROP TABLE IF EXISTS `WorkName`");
            bVar.v("DROP TABLE IF EXISTS `WorkProgress`");
            bVar.v("DROP TABLE IF EXISTS `Preference`");
            if (((androidx.room.h) WorkDatabase_Impl.this).f11364h != null) {
                int size = ((androidx.room.h) WorkDatabase_Impl.this).f11364h.size();
                for (int i8 = 0; i8 < size; i8++) {
                    ((h.b) ((androidx.room.h) WorkDatabase_Impl.this).f11364h.get(i8)).b(bVar);
                }
            }
        }

        @Override // androidx.room.i.a
        protected void c(g1.b bVar) {
            if (((androidx.room.h) WorkDatabase_Impl.this).f11364h != null) {
                int size = ((androidx.room.h) WorkDatabase_Impl.this).f11364h.size();
                for (int i8 = 0; i8 < size; i8++) {
                    ((h.b) ((androidx.room.h) WorkDatabase_Impl.this).f11364h.get(i8)).a(bVar);
                }
            }
        }

        @Override // androidx.room.i.a
        public void d(g1.b bVar) {
            ((androidx.room.h) WorkDatabase_Impl.this).f11357a = bVar;
            bVar.v("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.m(bVar);
            if (((androidx.room.h) WorkDatabase_Impl.this).f11364h != null) {
                int size = ((androidx.room.h) WorkDatabase_Impl.this).f11364h.size();
                for (int i8 = 0; i8 < size; i8++) {
                    ((h.b) ((androidx.room.h) WorkDatabase_Impl.this).f11364h.get(i8)).c(bVar);
                }
            }
        }

        @Override // androidx.room.i.a
        public void f(g1.b bVar) {
            AbstractC5738c.a(bVar);
        }

        @Override // androidx.room.i.a
        protected i.b g(g1.b bVar) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new C5741f.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap.put("prerequisite_id", new C5741f.a("prerequisite_id", "TEXT", true, 2, null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new C5741f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            hashSet.add(new C5741f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new C5741f.d("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id")));
            hashSet2.add(new C5741f.d("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id")));
            C5741f c5741f = new C5741f("Dependency", hashMap, hashSet, hashSet2);
            C5741f a8 = C5741f.a(bVar, "Dependency");
            if (!c5741f.equals(a8)) {
                return new i.b(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + c5741f + "\n Found:\n" + a8);
            }
            HashMap hashMap2 = new HashMap(25);
            hashMap2.put("id", new C5741f.a("id", "TEXT", true, 1, null, 1));
            hashMap2.put("state", new C5741f.a("state", "INTEGER", true, 0, null, 1));
            hashMap2.put("worker_class_name", new C5741f.a("worker_class_name", "TEXT", true, 0, null, 1));
            hashMap2.put("input_merger_class_name", new C5741f.a("input_merger_class_name", "TEXT", false, 0, null, 1));
            hashMap2.put("input", new C5741f.a("input", "BLOB", true, 0, null, 1));
            hashMap2.put("output", new C5741f.a("output", "BLOB", true, 0, null, 1));
            hashMap2.put("initial_delay", new C5741f.a("initial_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("interval_duration", new C5741f.a("interval_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("flex_duration", new C5741f.a("flex_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_attempt_count", new C5741f.a("run_attempt_count", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_policy", new C5741f.a("backoff_policy", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_delay_duration", new C5741f.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("period_start_time", new C5741f.a("period_start_time", "INTEGER", true, 0, null, 1));
            hashMap2.put("minimum_retention_duration", new C5741f.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("schedule_requested_at", new C5741f.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_in_foreground", new C5741f.a("run_in_foreground", "INTEGER", true, 0, null, 1));
            hashMap2.put("out_of_quota_policy", new C5741f.a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            hashMap2.put("required_network_type", new C5741f.a("required_network_type", "INTEGER", false, 0, null, 1));
            hashMap2.put("requires_charging", new C5741f.a("requires_charging", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_device_idle", new C5741f.a("requires_device_idle", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_battery_not_low", new C5741f.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_storage_not_low", new C5741f.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_content_update_delay", new C5741f.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_max_content_delay", new C5741f.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("content_uri_triggers", new C5741f.a("content_uri_triggers", "BLOB", false, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new C5741f.d("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at")));
            hashSet4.add(new C5741f.d("index_WorkSpec_period_start_time", false, Arrays.asList("period_start_time")));
            C5741f c5741f2 = new C5741f("WorkSpec", hashMap2, hashSet3, hashSet4);
            C5741f a9 = C5741f.a(bVar, "WorkSpec");
            if (!c5741f2.equals(a9)) {
                return new i.b(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + c5741f2 + "\n Found:\n" + a9);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("tag", new C5741f.a("tag", "TEXT", true, 1, null, 1));
            hashMap3.put("work_spec_id", new C5741f.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new C5741f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new C5741f.d("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id")));
            C5741f c5741f3 = new C5741f("WorkTag", hashMap3, hashSet5, hashSet6);
            C5741f a10 = C5741f.a(bVar, "WorkTag");
            if (!c5741f3.equals(a10)) {
                return new i.b(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + c5741f3 + "\n Found:\n" + a10);
            }
            HashMap hashMap4 = new HashMap(2);
            hashMap4.put("work_spec_id", new C5741f.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap4.put("system_id", new C5741f.a("system_id", "INTEGER", true, 0, null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new C5741f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            C5741f c5741f4 = new C5741f("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
            C5741f a11 = C5741f.a(bVar, "SystemIdInfo");
            if (!c5741f4.equals(a11)) {
                return new i.b(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + c5741f4 + "\n Found:\n" + a11);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put("name", new C5741f.a("name", "TEXT", true, 1, null, 1));
            hashMap5.put("work_spec_id", new C5741f.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new C5741f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new C5741f.d("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id")));
            C5741f c5741f5 = new C5741f("WorkName", hashMap5, hashSet8, hashSet9);
            C5741f a12 = C5741f.a(bVar, "WorkName");
            if (!c5741f5.equals(a12)) {
                return new i.b(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + c5741f5 + "\n Found:\n" + a12);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new C5741f.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap6.put("progress", new C5741f.a("progress", "BLOB", true, 0, null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new C5741f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            C5741f c5741f6 = new C5741f("WorkProgress", hashMap6, hashSet10, new HashSet(0));
            C5741f a13 = C5741f.a(bVar, "WorkProgress");
            if (!c5741f6.equals(a13)) {
                return new i.b(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + c5741f6 + "\n Found:\n" + a13);
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put("key", new C5741f.a("key", "TEXT", true, 1, null, 1));
            hashMap7.put("long_value", new C5741f.a("long_value", "INTEGER", false, 0, null, 1));
            C5741f c5741f7 = new C5741f("Preference", hashMap7, new HashSet(0), new HashSet(0));
            C5741f a14 = C5741f.a(bVar, "Preference");
            if (c5741f7.equals(a14)) {
                return new i.b(true, null);
            }
            return new i.b(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + c5741f7 + "\n Found:\n" + a14);
        }

        @Override // androidx.room.i.a
        public void e(g1.b bVar) {
        }
    }
}
