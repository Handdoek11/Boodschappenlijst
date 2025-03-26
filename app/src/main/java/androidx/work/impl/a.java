package androidx.work.impl;

import android.content.Context;
import d1.AbstractC5698a;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static AbstractC5698a f11833a = new C0197a(1, 2);

    /* renamed from: b, reason: collision with root package name */
    public static AbstractC5698a f11834b = new b(3, 4);

    /* renamed from: c, reason: collision with root package name */
    public static AbstractC5698a f11835c = new c(4, 5);

    /* renamed from: d, reason: collision with root package name */
    public static AbstractC5698a f11836d = new d(6, 7);

    /* renamed from: e, reason: collision with root package name */
    public static AbstractC5698a f11837e = new e(7, 8);

    /* renamed from: f, reason: collision with root package name */
    public static AbstractC5698a f11838f = new f(8, 9);

    /* renamed from: g, reason: collision with root package name */
    public static AbstractC5698a f11839g = new g(11, 12);

    /* renamed from: androidx.work.impl.a$a, reason: collision with other inner class name */
    class C0197a extends AbstractC5698a {
        C0197a(int i8, int i9) {
            super(i8, i9);
        }

        @Override // d1.AbstractC5698a
        public void a(g1.b bVar) {
            bVar.v("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.v("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            bVar.v("DROP TABLE IF EXISTS alarmInfo");
            bVar.v("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    class b extends AbstractC5698a {
        b(int i8, int i9) {
            super(i8, i9);
        }

        @Override // d1.AbstractC5698a
        public void a(g1.b bVar) {
            bVar.v("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
        }
    }

    class c extends AbstractC5698a {
        c(int i8, int i9) {
            super(i8, i9);
        }

        @Override // d1.AbstractC5698a
        public void a(g1.b bVar) {
            bVar.v("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            bVar.v("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    class d extends AbstractC5698a {
        d(int i8, int i9) {
            super(i8, i9);
        }

        @Override // d1.AbstractC5698a
        public void a(g1.b bVar) {
            bVar.v("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    class e extends AbstractC5698a {
        e(int i8, int i9) {
            super(i8, i9);
        }

        @Override // d1.AbstractC5698a
        public void a(g1.b bVar) {
            bVar.v("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    class f extends AbstractC5698a {
        f(int i8, int i9) {
            super(i8, i9);
        }

        @Override // d1.AbstractC5698a
        public void a(g1.b bVar) {
            bVar.v("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    class g extends AbstractC5698a {
        g(int i8, int i9) {
            super(i8, i9);
        }

        @Override // d1.AbstractC5698a
        public void a(g1.b bVar) {
            bVar.v("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    }

    public static class h extends AbstractC5698a {

        /* renamed from: c, reason: collision with root package name */
        final Context f11840c;

        public h(Context context, int i8, int i9) {
            super(i8, i9);
            this.f11840c = context;
        }

        @Override // d1.AbstractC5698a
        public void a(g1.b bVar) {
            if (this.f35202b >= 10) {
                bVar.Q("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
            } else {
                this.f11840c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
            }
        }
    }

    public static class i extends AbstractC5698a {

        /* renamed from: c, reason: collision with root package name */
        final Context f11841c;

        public i(Context context) {
            super(9, 10);
            this.f11841c = context;
        }

        @Override // d1.AbstractC5698a
        public void a(g1.b bVar) {
            bVar.v("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            B1.h.b(this.f11841c, bVar);
            B1.f.a(this.f11841c, bVar);
        }
    }
}
