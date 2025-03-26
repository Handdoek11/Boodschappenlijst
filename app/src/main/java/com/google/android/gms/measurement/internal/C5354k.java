package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.AbstractC5010r4;
import com.google.android.gms.internal.measurement.C4961l2;
import com.google.android.gms.internal.measurement.C4977n2;
import com.google.android.gms.internal.measurement.C4993p2;
import com.google.android.gms.internal.measurement.C5001q2;
import com.google.android.gms.internal.measurement.C5016s2;
import com.google.android.gms.internal.measurement.C5032u2;
import com.google.android.gms.internal.measurement.J1;
import com.google.android.gms.internal.measurement.K1;
import com.google.android.gms.internal.measurement.L1;
import com.google.android.gms.internal.measurement.N1;
import com.google.android.gms.internal.measurement.n7;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import q.C6397a;

/* renamed from: com.google.android.gms.measurement.internal.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5354k extends E5 {

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f31032f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f31033g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: h, reason: collision with root package name */
    private static final String[] f31034h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;"};

    /* renamed from: i, reason: collision with root package name */
    private static final String[] f31035i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: j, reason: collision with root package name */
    private static final String[] f31036j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: k, reason: collision with root package name */
    private static final String[] f31037k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: l, reason: collision with root package name */
    private static final String[] f31038l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: m, reason: collision with root package name */
    private static final String[] f31039m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: n, reason: collision with root package name */
    private static final String[] f31040n = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};

    /* renamed from: o, reason: collision with root package name */
    private static final String[] f31041o = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    /* renamed from: d, reason: collision with root package name */
    private final r f31042d;

    /* renamed from: e, reason: collision with root package name */
    private final C5457y5 f31043e;

    C5354k(H5 h52) {
        super(h52);
        this.f31043e = new C5457y5(zzb());
        this.f31042d = new r(this, zza(), "google_app_measurement.db");
    }

    private final long A0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = z().rawQuery(str, strArr);
                if (!rawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j8 = rawQuery.getLong(0);
                rawQuery.close();
                return j8;
            } catch (SQLiteException e8) {
                h().E().c("Database error", str, e8);
                throw e8;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    private final long E(String str, String[] strArr, long j8) {
        Cursor cursor = null;
        try {
            try {
                cursor = z().rawQuery(str, strArr);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return j8;
                }
                long j9 = cursor.getLong(0);
                cursor.close();
                return j9;
            } catch (SQLiteException e8) {
                h().E().c("Database error", str, e8);
                throw e8;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    private final boolean E0(String str, List list) {
        Z2.r.f(str);
        s();
        l();
        SQLiteDatabase z7 = z();
        try {
            long A02 = A0("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min(2000, a().u(str, G.f30386I)));
            if (A02 <= max) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i8 = 0; i8 < list.size(); i8++) {
                Integer num = (Integer) list.get(i8);
                if (num == null) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            String str2 = "(" + TextUtils.join(",", arrayList) + ")";
            StringBuilder sb = new StringBuilder("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            sb.append(str2);
            sb.append(" order by rowid desc limit -1 offset ?)");
            return z7.delete("audience_filter_values", sb.toString(), new String[]{str, Integer.toString(max)}) > 0;
        } catch (SQLiteException e8) {
            h().E().c("Database error querying filters. appId", C5378n2.t(str), e8);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.google.android.gms.measurement.internal.A H0(java.lang.String r29, java.lang.String r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5354k.H0(java.lang.String, java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.A");
    }

    private final Object K(Cursor cursor, int i8) {
        int type = cursor.getType(i8);
        if (type == 0) {
            h().E().a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i8));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i8));
        }
        if (type == 3) {
            return cursor.getString(i8);
        }
        if (type != 4) {
            h().E().b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        h().E().a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object L(java.lang.String r3, java.lang.String[] r4, com.google.android.gms.measurement.internal.InterfaceC5409s r5) {
        /*
            r2 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r2.z()     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L2f
            android.database.Cursor r3 = r1.rawQuery(r3, r4)     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L2f
            boolean r4 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L23
            if (r4 != 0) goto L25
            com.google.android.gms.measurement.internal.n2 r4 = r2.h()     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L23
            com.google.android.gms.measurement.internal.p2 r4 = r4.I()     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L23
            java.lang.String r5 = "No data found"
            r4.a(r5)     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L23
            r3.close()
            return r0
        L20:
            r4 = move-exception
            r0 = r3
            goto L44
        L23:
            r4 = move-exception
            goto L31
        L25:
            java.lang.Object r4 = r5.a(r3)     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L23
            r3.close()
            return r4
        L2d:
            r4 = move-exception
            goto L44
        L2f:
            r4 = move-exception
            r3 = r0
        L31:
            com.google.android.gms.measurement.internal.n2 r5 = r2.h()     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.measurement.internal.p2 r5 = r5.E()     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = "Error querying database."
            r5.b(r1, r4)     // Catch: java.lang.Throwable -> L20
            if (r3 == 0) goto L43
            r3.close()
        L43:
            return r0
        L44:
            if (r0 == 0) goto L49
            r0.close()
        L49:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5354k.L(java.lang.String, java.lang.String[], com.google.android.gms.measurement.internal.s):java.lang.Object");
    }

    private final String N(String str, String[] strArr, String str2) {
        Cursor cursor = null;
        try {
            try {
                cursor = z().rawQuery(str, strArr);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return str2;
                }
                String string = cursor.getString(0);
                cursor.close();
                return string;
            } catch (SQLiteException e8) {
                h().E().c("Database error", str, e8);
                throw e8;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    private static void R(ContentValues contentValues, String str, Object obj) {
        Z2.r.f(str);
        Z2.r.l(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put(str, (Double) obj);
        }
    }

    private final void T0(String str, String str2) {
        Z2.r.f(str2);
        l();
        s();
        try {
            z().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e8) {
            h().E().c("Error deleting snapshot. appId", C5378n2.t(str2), e8);
        }
    }

    private final void X(String str, A a8) {
        Z2.r.l(a8);
        l();
        s();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", a8.f30249a);
        contentValues.put("name", a8.f30250b);
        contentValues.put("lifetime_count", Long.valueOf(a8.f30251c));
        contentValues.put("current_bundle_count", Long.valueOf(a8.f30252d));
        contentValues.put("last_fire_timestamp", Long.valueOf(a8.f30254f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(a8.f30255g));
        contentValues.put("last_bundled_day", a8.f30256h);
        contentValues.put("last_sampled_complex_event_id", a8.f30257i);
        contentValues.put("last_sampling_rate", a8.f30258j);
        contentValues.put("current_session_count", Long.valueOf(a8.f30253e));
        Boolean bool = a8.f30259k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (z().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                h().E().b("Failed to insert/update event aggregates (got -1). appId", C5378n2.t(a8.f30249a));
            }
        } catch (SQLiteException e8) {
            h().E().c("Error storing event aggregates. appId", C5378n2.t(a8.f30249a), e8);
        }
    }

    private final void Z(String str, String str2, ContentValues contentValues) {
        try {
            SQLiteDatabase z7 = z();
            if (contentValues.getAsString(str2) == null) {
                h().F().b("Value of the primary key is not set.", C5378n2.t(str2));
                return;
            }
            if (z7.update(str, contentValues, str2 + " = ?", new String[]{r1}) == 0 && z7.insertWithOnConflict(str, null, contentValues, 5) == -1) {
                h().E().c("Failed to insert/update table (got -1). key", C5378n2.t(str), C5378n2.t(str2));
            }
        } catch (SQLiteException e8) {
            h().E().d("Error storing into table. key", C5378n2.t(str), C5378n2.t(str2), e8);
        }
    }

    private final boolean c0(long j8, B b8, long j9, boolean z7) {
        l();
        s();
        Z2.r.l(b8);
        Z2.r.f(b8.f30282a);
        byte[] j10 = m().C(b8).j();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", b8.f30282a);
        contentValues.put("name", b8.f30283b);
        contentValues.put("timestamp", Long.valueOf(b8.f30285d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j9));
        contentValues.put("data", j10);
        contentValues.put("realtime", Integer.valueOf(z7 ? 1 : 0));
        try {
            long update = z().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j8)});
            if (update == 1) {
                return true;
            }
            h().E().c("Failed to update raw event. appId, updatedRows", C5378n2.t(b8.f30282a), Long.valueOf(update));
            return false;
        } catch (SQLiteException e8) {
            h().E().c("Error updating raw event. appId", C5378n2.t(b8.f30282a), e8);
            return false;
        }
    }

    private final boolean h0(String str, int i8, com.google.android.gms.internal.measurement.K1 k12) {
        s();
        l();
        Z2.r.f(str);
        Z2.r.l(k12);
        if (k12.N().isEmpty()) {
            h().J().d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", C5378n2.t(str), Integer.valueOf(i8), String.valueOf(k12.T() ? Integer.valueOf(k12.J()) : null));
            return false;
        }
        byte[] j8 = k12.j();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i8));
        contentValues.put("filter_id", k12.T() ? Integer.valueOf(k12.J()) : null);
        contentValues.put("event_name", k12.N());
        contentValues.put("session_scoped", k12.U() ? Boolean.valueOf(k12.R()) : null);
        contentValues.put("data", j8);
        try {
            if (z().insertWithOnConflict("event_filters", null, contentValues, 5) != -1) {
                return true;
            }
            h().E().b("Failed to insert event filter (got -1). appId", C5378n2.t(str));
            return true;
        } catch (SQLiteException e8) {
            h().E().c("Error storing event filter. appId", C5378n2.t(str), e8);
            return false;
        }
    }

    private final boolean i0(String str, int i8, com.google.android.gms.internal.measurement.N1 n12) {
        s();
        l();
        Z2.r.f(str);
        Z2.r.l(n12);
        if (n12.K().isEmpty()) {
            h().J().d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", C5378n2.t(str), Integer.valueOf(i8), String.valueOf(n12.O() ? Integer.valueOf(n12.k()) : null));
            return false;
        }
        byte[] j8 = n12.j();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i8));
        contentValues.put("filter_id", n12.O() ? Integer.valueOf(n12.k()) : null);
        contentValues.put("property_name", n12.K());
        contentValues.put("session_scoped", n12.P() ? Boolean.valueOf(n12.N()) : null);
        contentValues.put("data", j8);
        try {
            if (z().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                return true;
            }
            h().E().b("Failed to insert property filter (got -1). appId", C5378n2.t(str));
            return false;
        } catch (SQLiteException e8) {
            h().E().c("Error storing property filter. appId", C5378n2.t(str), e8);
            return false;
        }
    }

    private final String x0() {
        long a8 = zzb().a();
        w3.C c8 = w3.C.GOOGLE_SIGNAL;
        return "(" + ("(upload_type = " + c8.zza() + " AND (ABS(creation_timestamp - " + a8 + ") > CAST(" + ((Long) G.f30382G.a(null)).longValue() + " AS INTEGER)))") + " OR " + ("(upload_type != " + c8.zza() + " AND (ABS(creation_timestamp - " + a8 + ") > CAST(" + C5326g.N() + " AS INTEGER)))") + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String A() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.z()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L22 android.database.sqlite.SQLiteException -> L27
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            if (r2 == 0) goto L1e
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            r0.close()
            return r1
        L1a:
            r1 = move-exception
            goto L3c
        L1c:
            r2 = move-exception
            goto L29
        L1e:
            r0.close()
            return r1
        L22:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L3c
        L27:
            r2 = move-exception
            r0 = r1
        L29:
            com.google.android.gms.measurement.internal.n2 r3 = r6.h()     // Catch: java.lang.Throwable -> L1a
            com.google.android.gms.measurement.internal.p2 r3 = r3.E()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.b(r4, r2)     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L3b
            r0.close()
        L3b:
            return r1
        L3c:
            if (r0 == 0) goto L41
            r0.close()
        L41:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5354k.A():java.lang.String");
    }

    public final int B(String str, String str2) {
        Z2.r.f(str);
        Z2.r.f(str2);
        l();
        s();
        try {
            return z().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e8) {
            h().E().d("Error deleting conditional property", C5378n2.t(str), e().g(str2), e8);
            return 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a1, code lost:
    
        h().E().b("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List B0(java.lang.String r23, java.lang.String r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5354k.B0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final long C(C5001q2 c5001q2) {
        l();
        s();
        Z2.r.l(c5001q2);
        Z2.r.f(c5001q2.x2());
        byte[] j8 = c5001q2.j();
        long y7 = m().y(j8);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c5001q2.x2());
        contentValues.put("metadata_fingerprint", Long.valueOf(y7));
        contentValues.put("metadata", j8);
        try {
            z().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return y7;
        } catch (SQLiteException e8) {
            h().E().c("Error storing raw event metadata. appId", C5378n2.t(c5001q2.x2()), e8);
            throw e8;
        }
    }

    public final void C0(String str, A3 a32) {
        Z2.r.l(str);
        Z2.r.l(a32);
        l();
        s();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", a32.x());
        contentValues.put("consent_source", Integer.valueOf(a32.b()));
        Z("consent_settings", "app_id", contentValues);
    }

    public final long D(String str) {
        Z2.r.f(str);
        l();
        s();
        try {
            return z().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, a().u(str, G.f30467q))))});
        } catch (SQLiteException e8) {
            h().E().c("Error deleting over the limit events. appId", C5378n2.t(str), e8);
            return 0L;
        }
    }

    final boolean D0(String str, Bundle bundle) {
        l();
        s();
        byte[] j8 = m().C(new B(this.f31239a, "", str, "dep", 0L, 0L, bundle)).j();
        h().I().c("Saving default event parameters, appId, data size", e().c(str), Integer.valueOf(j8.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", j8);
        try {
            if (z().insertWithOnConflict("default_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            h().E().b("Failed to insert default event parameters (got -1). appId", C5378n2.t(str));
            return false;
        } catch (SQLiteException e8) {
            h().E().c("Error storing default event parameters. appId", C5378n2.t(str), e8);
            return false;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0031: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:50), block:B:10:0x0031 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair F(java.lang.String r6, java.lang.Long r7) {
        /*
            r5 = this;
            r5.l()
            r5.s()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r5.z()     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            java.lang.String r2 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            java.lang.String r3 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            java.lang.String[] r3 = new java.lang.String[]{r6, r3}     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            if (r2 != 0) goto L35
            com.google.android.gms.measurement.internal.n2 r6 = r5.h()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            com.google.android.gms.measurement.internal.p2 r6 = r6.I()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            java.lang.String r7 = "Main event not found"
            r6.a(r7)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            r1.close()
            return r0
        L30:
            r6 = move-exception
            r0 = r1
            goto L8a
        L33:
            r6 = move-exception
            goto L77
        L35:
            r2 = 0
            byte[] r2 = r1.getBlob(r2)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            r3 = 1
            long r3 = r1.getLong(r3)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            com.google.android.gms.internal.measurement.l2$a r4 = com.google.android.gms.internal.measurement.C4961l2.S()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33 java.io.IOException -> L5d
            com.google.android.gms.internal.measurement.V4 r2 = com.google.android.gms.measurement.internal.Z5.E(r4, r2)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33 java.io.IOException -> L5d
            com.google.android.gms.internal.measurement.l2$a r2 = (com.google.android.gms.internal.measurement.C4961l2.a) r2     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33 java.io.IOException -> L5d
            com.google.android.gms.internal.measurement.W4 r2 = r2.u()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33 java.io.IOException -> L5d
            com.google.android.gms.internal.measurement.r4 r2 = (com.google.android.gms.internal.measurement.AbstractC5010r4) r2     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33 java.io.IOException -> L5d
            com.google.android.gms.internal.measurement.l2 r2 = (com.google.android.gms.internal.measurement.C4961l2) r2     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33 java.io.IOException -> L5d
            android.util.Pair r6 = android.util.Pair.create(r2, r3)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            r1.close()
            return r6
        L5d:
            r2 = move-exception
            com.google.android.gms.measurement.internal.n2 r3 = r5.h()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            com.google.android.gms.measurement.internal.p2 r3 = r3.E()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            java.lang.String r4 = "Failed to merge main event. appId, eventId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C5378n2.t(r6)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            r3.d(r4, r6, r7, r2)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            r1.close()
            return r0
        L73:
            r6 = move-exception
            goto L8a
        L75:
            r6 = move-exception
            r1 = r0
        L77:
            com.google.android.gms.measurement.internal.n2 r7 = r5.h()     // Catch: java.lang.Throwable -> L30
            com.google.android.gms.measurement.internal.p2 r7 = r7.E()     // Catch: java.lang.Throwable -> L30
            java.lang.String r2 = "Error selecting main event"
            r7.b(r2, r6)     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L89
            r1.close()
        L89:
            return r0
        L8a:
            if (r0 == 0) goto L8f
            r0.close()
        L8f:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5354k.F(java.lang.String, java.lang.Long):android.util.Pair");
    }

    public final long F0(String str) {
        Z2.r.f(str);
        return E("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final C5382o G(long j8, String str, long j9, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        Z2.r.f(str);
        l();
        s();
        String[] strArr = {str};
        C5382o c5382o = new C5382o();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase z14 = z();
                Cursor query = z14.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    h().J().b("Not updating daily counts, app is not known. appId", C5378n2.t(str));
                    query.close();
                    return c5382o;
                }
                if (query.getLong(0) == j8) {
                    c5382o.f31120b = query.getLong(1);
                    c5382o.f31119a = query.getLong(2);
                    c5382o.f31121c = query.getLong(3);
                    c5382o.f31122d = query.getLong(4);
                    c5382o.f31123e = query.getLong(5);
                    c5382o.f31124f = query.getLong(6);
                    c5382o.f31125g = query.getLong(7);
                }
                if (z7) {
                    c5382o.f31120b += j9;
                }
                if (z8) {
                    c5382o.f31119a += j9;
                }
                if (z9) {
                    c5382o.f31121c += j9;
                }
                if (z10) {
                    c5382o.f31122d += j9;
                }
                if (z11) {
                    c5382o.f31123e += j9;
                }
                if (z12) {
                    c5382o.f31124f += j9;
                }
                if (z13) {
                    c5382o.f31125g += j9;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j8));
                contentValues.put("daily_public_events_count", Long.valueOf(c5382o.f31119a));
                contentValues.put("daily_events_count", Long.valueOf(c5382o.f31120b));
                contentValues.put("daily_conversions_count", Long.valueOf(c5382o.f31121c));
                contentValues.put("daily_error_events_count", Long.valueOf(c5382o.f31122d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(c5382o.f31123e));
                contentValues.put("daily_realtime_dcu_count", Long.valueOf(c5382o.f31124f));
                contentValues.put("daily_registered_triggers_count", Long.valueOf(c5382o.f31125g));
                z14.update("apps", contentValues, "app_id=?", strArr);
                query.close();
                return c5382o;
            } catch (SQLiteException e8) {
                h().E().c("Error updating daily counts. appId", C5378n2.t(str), e8);
                if (0 != 0) {
                    cursor.close();
                }
                return c5382o;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0053: MOVE (r8 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]) (LINE:84), block:B:14:0x0053 */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.C5312e G0(java.lang.String r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5354k.G0(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.e");
    }

    public final C5382o H(long j8, String str, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        return G(j8, str, 1L, false, false, z9, false, z11, z12, z13);
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x002d: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:46), block:B:10:0x002d */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle I0(java.lang.String r6) {
        /*
            r5 = this;
            r5.l()
            r5.s()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r5.z()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r2 = "select parameters from default_event_params where app_id=?"
            java.lang.String[] r3 = new java.lang.String[]{r6}     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            if (r2 != 0) goto L31
            com.google.android.gms.measurement.internal.n2 r6 = r5.h()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            com.google.android.gms.measurement.internal.p2 r6 = r6.I()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            java.lang.String r2 = "Default event parameters not found"
            r6.a(r2)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            r1.close()
            return r0
        L2c:
            r6 = move-exception
            r0 = r1
            goto L84
        L2f:
            r6 = move-exception
            goto L71
        L31:
            r2 = 0
            byte[] r2 = r1.getBlob(r2)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            com.google.android.gms.internal.measurement.l2$a r3 = com.google.android.gms.internal.measurement.C4961l2.S()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f java.io.IOException -> L57
            com.google.android.gms.internal.measurement.V4 r2 = com.google.android.gms.measurement.internal.Z5.E(r3, r2)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f java.io.IOException -> L57
            com.google.android.gms.internal.measurement.l2$a r2 = (com.google.android.gms.internal.measurement.C4961l2.a) r2     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f java.io.IOException -> L57
            com.google.android.gms.internal.measurement.W4 r2 = r2.u()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f java.io.IOException -> L57
            com.google.android.gms.internal.measurement.r4 r2 = (com.google.android.gms.internal.measurement.AbstractC5010r4) r2     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f java.io.IOException -> L57
            com.google.android.gms.internal.measurement.l2 r2 = (com.google.android.gms.internal.measurement.C4961l2) r2     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f java.io.IOException -> L57
            r5.m()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            java.util.List r6 = r2.V()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            android.os.Bundle r6 = com.google.android.gms.measurement.internal.Z5.z(r6)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            r1.close()
            return r6
        L57:
            r2 = move-exception
            com.google.android.gms.measurement.internal.n2 r3 = r5.h()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            com.google.android.gms.measurement.internal.p2 r3 = r3.E()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C5378n2.t(r6)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            r3.c(r4, r6, r2)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            r1.close()
            return r0
        L6d:
            r6 = move-exception
            goto L84
        L6f:
            r6 = move-exception
            r1 = r0
        L71:
            com.google.android.gms.measurement.internal.n2 r2 = r5.h()     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.measurement.internal.p2 r2 = r2.E()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r3 = "Error selecting default event parameters"
            r2.b(r3, r6)     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L83
            r1.close()
        L83:
            return r0
        L84:
            if (r0 == 0) goto L89
            r0.close()
        L89:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5354k.I0(java.lang.String):android.os.Bundle");
    }

    public final A J0(String str, String str2) {
        return H0("events", str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0383  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.C5301c2 K0(java.lang.String r51) {
        /*
            Method dump skipped, instructions count: 903
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5354k.K0(java.lang.String):com.google.android.gms.measurement.internal.c2");
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x006a: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:107), block:B:19:0x006a */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.a6 L0(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            Z2.r.f(r11)
            Z2.r.f(r12)
            r10.l()
            r10.s()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.z()     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> L74
            java.lang.String r2 = "user_attributes"
            java.lang.String r3 = "set_timestamp"
            java.lang.String r4 = "value"
            java.lang.String r5 = "origin"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r5}     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> L74
            java.lang.String r4 = "app_id=? and name=?"
            java.lang.String[] r5 = new java.lang.String[]{r11, r12}     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> L74
            r7 = 0
            r8 = 0
            r6 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> L74
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6c
            if (r2 != 0) goto L34
            r1.close()
            return r0
        L34:
            r2 = 0
            long r7 = r1.getLong(r2)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6c
            r2 = 1
            java.lang.Object r9 = r10.K(r1, r2)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6c
            if (r9 != 0) goto L44
            r1.close()
            return r0
        L44:
            r2 = 2
            java.lang.String r5 = r1.getString(r2)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6c
            com.google.android.gms.measurement.internal.a6 r2 = new com.google.android.gms.measurement.internal.a6     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6c
            r3 = r2
            r4 = r11
            r6 = r12
            r3.<init>(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6c
            boolean r3 = r1.moveToNext()     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6c
            if (r3 == 0) goto L6e
            com.google.android.gms.measurement.internal.n2 r3 = r10.h()     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6c
            com.google.android.gms.measurement.internal.p2 r3 = r3.E()     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6c
            java.lang.String r4 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C5378n2.t(r11)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6c
            r3.b(r4, r5)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6c
            goto L6e
        L69:
            r11 = move-exception
            r0 = r1
            goto L95
        L6c:
            r2 = move-exception
            goto L76
        L6e:
            r1.close()
            return r2
        L72:
            r11 = move-exception
            goto L95
        L74:
            r2 = move-exception
            r1 = r0
        L76:
            com.google.android.gms.measurement.internal.n2 r3 = r10.h()     // Catch: java.lang.Throwable -> L69
            com.google.android.gms.measurement.internal.p2 r3 = r3.E()     // Catch: java.lang.Throwable -> L69
            java.lang.String r4 = "Error querying user property. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C5378n2.t(r11)     // Catch: java.lang.Throwable -> L69
            com.google.android.gms.measurement.internal.h2 r5 = r10.e()     // Catch: java.lang.Throwable -> L69
            java.lang.String r12 = r5.g(r12)     // Catch: java.lang.Throwable -> L69
            r3.d(r4, r11, r12, r2)     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto L94
            r1.close()
        L94:
            return r0
        L95:
            if (r0 == 0) goto L9a
            r0.close()
        L9a:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5354k.L0(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.a6");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String M(long r4) {
        /*
            r3 = this;
            r3.l()
            r3.s()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r3.z()     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteException -> L40
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteException -> L40
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteException -> L40
            android.database.Cursor r4 = r1.rawQuery(r2, r4)     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteException -> L40
            boolean r5 = r4.moveToFirst()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            if (r5 != 0) goto L35
            com.google.android.gms.measurement.internal.n2 r5 = r3.h()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            com.google.android.gms.measurement.internal.p2 r5 = r5.I()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            java.lang.String r1 = "No expired configs for apps with pending events"
            r5.a(r1)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            r4.close()
            return r0
        L30:
            r5 = move-exception
            r0 = r4
            goto L55
        L33:
            r5 = move-exception
            goto L42
        L35:
            r5 = 0
            java.lang.String r5 = r4.getString(r5)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            r4.close()
            return r5
        L3e:
            r5 = move-exception
            goto L55
        L40:
            r5 = move-exception
            r4 = r0
        L42:
            com.google.android.gms.measurement.internal.n2 r1 = r3.h()     // Catch: java.lang.Throwable -> L30
            com.google.android.gms.measurement.internal.p2 r1 = r1.E()     // Catch: java.lang.Throwable -> L30
            java.lang.String r2 = "Error selecting expired configs"
            r1.b(r2, r5)     // Catch: java.lang.Throwable -> L30
            if (r4 == 0) goto L54
            r4.close()
        L54:
            return r0
        L55:
            if (r0 == 0) goto L5a
            r0.close()
        L5a:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5354k.M(long):java.lang.String");
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0059: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:90), block:B:14:0x0059 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.C5361l M0(java.lang.String r10) {
        /*
            r9 = this;
            Z2.r.f(r10)
            r9.l()
            r9.s()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r9.z()     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            java.lang.String r2 = "apps"
            java.lang.String r3 = "remote_config"
            java.lang.String r4 = "config_last_modified_time"
            java.lang.String r5 = "e_tag"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r5}     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            java.lang.String r4 = "app_id=?"
            java.lang.String[] r5 = new java.lang.String[]{r10}     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            r7 = 0
            r8 = 0
            r6 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5b
            if (r2 != 0) goto L31
            r1.close()
            return r0
        L31:
            r2 = 0
            byte[] r2 = r1.getBlob(r2)     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5b
            r3 = 1
            java.lang.String r3 = r1.getString(r3)     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5b
            r4 = 2
            java.lang.String r4 = r1.getString(r4)     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5b
            boolean r5 = r1.moveToNext()     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5b
            if (r5 == 0) goto L5d
            com.google.android.gms.measurement.internal.n2 r5 = r9.h()     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5b
            com.google.android.gms.measurement.internal.p2 r5 = r5.E()     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5b
            java.lang.String r6 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C5378n2.t(r10)     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5b
            r5.b(r6, r7)     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5b
            goto L5d
        L58:
            r10 = move-exception
            r0 = r1
            goto L87
        L5b:
            r2 = move-exception
            goto L70
        L5d:
            if (r2 != 0) goto L63
            r1.close()
            return r0
        L63:
            com.google.android.gms.measurement.internal.l r5 = new com.google.android.gms.measurement.internal.l     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5b
            r5.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5b
            r1.close()
            return r5
        L6c:
            r10 = move-exception
            goto L87
        L6e:
            r2 = move-exception
            r1 = r0
        L70:
            com.google.android.gms.measurement.internal.n2 r3 = r9.h()     // Catch: java.lang.Throwable -> L58
            com.google.android.gms.measurement.internal.p2 r3 = r3.E()     // Catch: java.lang.Throwable -> L58
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.C5378n2.t(r10)     // Catch: java.lang.Throwable -> L58
            r3.c(r4, r10, r2)     // Catch: java.lang.Throwable -> L58
            if (r1 == 0) goto L86
            r1.close()
        L86:
            return r0
        L87:
            if (r0 == 0) goto L8c
            r0.close()
        L8c:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5354k.M0(java.lang.String):com.google.android.gms.measurement.internal.l");
    }

    final Map N0(String str, String str2) {
        s();
        l();
        Z2.r.f(str);
        Z2.r.f(str2);
        C6397a c6397a = new C6397a();
        Cursor cursor = null;
        try {
            try {
                Cursor query = z().query("event_filters", new String[]{"audience_id", "data"}, "app_id=? AND event_name=?", new String[]{str, str2}, null, null, null);
                if (!query.moveToFirst()) {
                    Map emptyMap = Collections.emptyMap();
                    query.close();
                    return emptyMap;
                }
                do {
                    try {
                        com.google.android.gms.internal.measurement.K1 k12 = (com.google.android.gms.internal.measurement.K1) ((AbstractC5010r4) ((K1.a) Z5.E(com.google.android.gms.internal.measurement.K1.K(), query.getBlob(1))).u());
                        int i8 = query.getInt(0);
                        List list = (List) c6397a.get(Integer.valueOf(i8));
                        if (list == null) {
                            list = new ArrayList();
                            c6397a.put(Integer.valueOf(i8), list);
                        }
                        list.add(k12);
                    } catch (IOException e8) {
                        h().E().c("Failed to merge filter. appId", C5378n2.t(str), e8);
                    }
                } while (query.moveToNext());
                query.close();
                return c6397a;
            } catch (SQLiteException e9) {
                h().E().c("Database error querying filters. appId", C5378n2.t(str), e9);
                Map emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final List O(String str, int i8, int i9) {
        byte[] h02;
        long j8;
        long j9;
        l();
        s();
        int i10 = 1;
        Z2.r.a(i8 > 0);
        Z2.r.a(i9 > 0);
        Z2.r.f(str);
        Cursor cursor = null;
        try {
            try {
                Cursor query = z().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(i8));
                if (!query.moveToFirst()) {
                    List emptyList = Collections.emptyList();
                    query.close();
                    return emptyList;
                }
                ArrayList arrayList = new ArrayList();
                int i11 = 0;
                while (true) {
                    long j10 = query.getLong(0);
                    try {
                        h02 = m().h0(query.getBlob(i10));
                    } catch (IOException e8) {
                        h().E().c("Failed to unzip queued bundle. appId", C5378n2.t(str), e8);
                    }
                    if (!arrayList.isEmpty() && h02.length + i11 > i9) {
                        break;
                    }
                    try {
                        C5001q2.a aVar = (C5001q2.a) Z5.E(C5001q2.u2(), h02);
                        if (!arrayList.isEmpty()) {
                            C5001q2 c5001q2 = (C5001q2) ((Pair) arrayList.get(0)).first;
                            C5001q2 c5001q22 = (C5001q2) ((AbstractC5010r4) aVar.u());
                            if (!c5001q2.Y().equals(c5001q22.Y()) || !c5001q2.X().equals(c5001q22.X()) || c5001q2.o0() != c5001q22.o0() || !c5001q2.Z().equals(c5001q22.Z())) {
                                break;
                            }
                            Iterator it = c5001q2.m0().iterator();
                            while (true) {
                                j8 = -1;
                                if (!it.hasNext()) {
                                    j9 = -1;
                                    break;
                                }
                                C5032u2 c5032u2 = (C5032u2) it.next();
                                if ("_npa".equals(c5032u2.U())) {
                                    j9 = c5032u2.P();
                                    break;
                                }
                            }
                            Iterator it2 = c5001q22.m0().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                C5032u2 c5032u22 = (C5032u2) it2.next();
                                if ("_npa".equals(c5032u22.U())) {
                                    j8 = c5032u22.P();
                                    break;
                                }
                            }
                            if (j9 != j8) {
                                break;
                            }
                        }
                        if (!query.isNull(2)) {
                            aVar.C0(query.getInt(2));
                        }
                        i11 += h02.length;
                        arrayList.add(Pair.create((C5001q2) ((AbstractC5010r4) aVar.u()), Long.valueOf(j10)));
                    } catch (IOException e9) {
                        h().E().c("Failed to merge queued bundle. appId", C5378n2.t(str), e9);
                    }
                    if (!query.moveToNext() || i11 > i9) {
                        break;
                    }
                    i10 = 1;
                }
                query.close();
                return arrayList;
            } catch (SQLiteException e10) {
                h().E().c("Error querying bundles. appId", C5378n2.t(str), e10);
                List emptyList2 = Collections.emptyList();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyList2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final C5430v O0(String str) {
        Z2.r.l(str);
        l();
        s();
        return C5430v.c(N("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
    }

    public final List P(String str, String str2, String str3) {
        Z2.r.f(str);
        l();
        s();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(str3 + "*");
            sb.append(" and name glob ?");
        }
        return Q(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    final Map P0(String str, String str2) {
        s();
        l();
        Z2.r.f(str);
        Z2.r.f(str2);
        C6397a c6397a = new C6397a();
        Cursor cursor = null;
        try {
            try {
                Cursor query = z().query("property_filters", new String[]{"audience_id", "data"}, "app_id=? AND property_name=?", new String[]{str, str2}, null, null, null);
                if (!query.moveToFirst()) {
                    Map emptyMap = Collections.emptyMap();
                    query.close();
                    return emptyMap;
                }
                do {
                    try {
                        com.google.android.gms.internal.measurement.N1 n12 = (com.google.android.gms.internal.measurement.N1) ((AbstractC5010r4) ((N1.a) Z5.E(com.google.android.gms.internal.measurement.N1.I(), query.getBlob(1))).u());
                        int i8 = query.getInt(0);
                        List list = (List) c6397a.get(Integer.valueOf(i8));
                        if (list == null) {
                            list = new ArrayList();
                            c6397a.put(Integer.valueOf(i8), list);
                        }
                        list.add(n12);
                    } catch (IOException e8) {
                        h().E().c("Failed to merge filter", C5378n2.t(str), e8);
                    }
                } while (query.moveToNext());
                query.close();
                return c6397a;
            } catch (SQLiteException e9) {
                h().E().c("Database error querying filters. appId", C5378n2.t(str), e9);
                Map emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0050, code lost:
    
        h().E().b("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List Q(java.lang.String r27, java.lang.String[] r28) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5354k.Q(java.lang.String, java.lang.String[]):java.util.List");
    }

    public final A3 Q0(String str) {
        Z2.r.l(str);
        l();
        s();
        return A3.q(N("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
    }

    public final void R0(String str, String str2) {
        Z2.r.f(str);
        Z2.r.f(str2);
        l();
        s();
        try {
            z().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e8) {
            h().E().d("Error deleting user property. appId", C5378n2.t(str), e().g(str2), e8);
        }
    }

    public final void S(A a8) {
        X("events", a8);
    }

    public final A3 S0(String str) {
        Z2.r.l(str);
        l();
        s();
        A3 a32 = (A3) L("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[]{str}, new InterfaceC5409s() { // from class: com.google.android.gms.measurement.internal.m
            @Override // com.google.android.gms.measurement.internal.InterfaceC5409s
            public final Object a(Cursor cursor) {
                return A3.e(cursor.getString(0), cursor.getInt(1));
            }
        });
        return a32 == null ? A3.f30265c : a32;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void T(com.google.android.gms.measurement.internal.C5301c2 r8, boolean r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 845
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5354k.T(com.google.android.gms.measurement.internal.c2, boolean, boolean):void");
    }

    final void U(Long l8) {
        l();
        s();
        Z2.r.l(l8);
        if ((!n7.a() || a().r(G.f30375C0)) && m0()) {
            if (A0("SELECT COUNT(1) FROM upload_queue WHERE rowid = " + l8 + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                h().J().a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                z().execSQL("UPDATE upload_queue SET retry_count = retry_count + 1 WHERE rowid = " + l8 + " AND retry_count < 2147483647");
            } catch (SQLiteException e8) {
                h().E().b("Error incrementing retry count. error", e8);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017f  */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.V5 U0(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5354k.U0(java.lang.String):com.google.android.gms.measurement.internal.V5");
    }

    public final void V(String str, Bundle bundle) {
        Z2.r.l(bundle);
        l();
        s();
        C5389p c5389p = new C5389p(this, str);
        for (List<C5375n> a8 = c5389p.a(); !a8.isEmpty(); a8 = c5389p.a()) {
            for (C5375n c5375n : a8) {
                Z5 m8 = m();
                C4961l2 c4961l2 = c5375n.f31099d;
                Bundle bundle2 = new Bundle();
                for (C4977n2 c4977n2 : c4961l2.V()) {
                    if (c4977n2.Z()) {
                        bundle2.putDouble(c4977n2.W(), c4977n2.G());
                    } else if (c4977n2.a0()) {
                        bundle2.putFloat(c4977n2.W(), c4977n2.N());
                    } else if (c4977n2.b0()) {
                        bundle2.putLong(c4977n2.W(), c4977n2.S());
                    } else if (c4977n2.d0()) {
                        bundle2.putString(c4977n2.W(), c4977n2.X());
                    } else if (c4977n2.Y().isEmpty()) {
                        m8.h().E().b("Unexpected parameter type for parameter", c4977n2);
                    } else {
                        bundle2.putParcelableArray(c4977n2.W(), Z5.g0(c4977n2.Y()));
                    }
                }
                String string = bundle2.getString("_o");
                bundle2.remove("_o");
                String U7 = c4961l2.U();
                if (string == null) {
                    string = "";
                }
                C5405r2 c5405r2 = new C5405r2(U7, string, bundle2, c4961l2.R());
                g().L(c5405r2.f31170d, bundle);
                c0(c5375n.f31096a, new B(this.f31239a, c5405r2.f31168b, str, c5375n.f31099d.U(), c5375n.f31099d.R(), c5375n.f31099d.Q(), c5405r2.f31170d), c5375n.f31097b, c5375n.f31098c);
            }
        }
    }

    public final List V0(String str) {
        Z2.r.f(str);
        l();
        s();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = z().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str}, null, null, "rowid", null);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return arrayList;
                }
                do {
                    String string = cursor.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    arrayList.add(new B5(string, cursor.getLong(1), cursor.getInt(2)));
                } while (cursor.moveToNext());
                cursor.close();
                return arrayList;
            } catch (SQLiteException e8) {
                h().E().c("Error querying trigger uris. appId", C5378n2.t(str), e8);
                List emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void W(String str, C5430v c5430v) {
        Z2.r.l(str);
        Z2.r.l(c5430v);
        l();
        s();
        if (a().r(G.f30407S0)) {
            A3 S02 = S0(str);
            A3 a32 = A3.f30265c;
            if (S02 == a32) {
                C0(str, a32);
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", c5430v.j());
        Z("consent_settings", "app_id", contentValues);
    }

    public final List W0(String str) {
        Z2.r.f(str);
        l();
        s();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = z().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return arrayList;
                }
                do {
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j8 = cursor.getLong(2);
                    Object K7 = K(cursor, 3);
                    if (K7 == null) {
                        h().E().b("Read invalid user property value, ignoring it. appId", C5378n2.t(str));
                    } else {
                        arrayList.add(new a6(str, str2, string, j8, K7));
                    }
                } while (cursor.moveToNext());
                cursor.close();
                return arrayList;
            } catch (SQLiteException e8) {
                h().E().c("Error querying user properties. appId", C5378n2.t(str), e8);
                List emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    final Map X0(String str) {
        s();
        l();
        Z2.r.f(str);
        Cursor cursor = null;
        try {
            try {
                Cursor query = z().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    Map emptyMap = Collections.emptyMap();
                    query.close();
                    return emptyMap;
                }
                C6397a c6397a = new C6397a();
                do {
                    int i8 = query.getInt(0);
                    try {
                        c6397a.put(Integer.valueOf(i8), (C5016s2) ((AbstractC5010r4) ((C5016s2.a) Z5.E(C5016s2.R(), query.getBlob(1))).u()));
                    } catch (IOException e8) {
                        h().E().d("Failed to merge filter results. appId, audienceId, error", C5378n2.t(str), Integer.valueOf(i8), e8);
                    }
                } while (query.moveToNext());
                query.close();
                return c6397a;
            } catch (SQLiteException e9) {
                h().E().c("Database error querying filter results. appId", C5378n2.t(str), e9);
                Map emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void Y(String str, A3 a32) {
        Z2.r.l(str);
        Z2.r.l(a32);
        l();
        s();
        C0(str, S0(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", a32.x());
        Z("consent_settings", "app_id", contentValues);
    }

    final Map Y0(String str) {
        Z2.r.f(str);
        C6397a c6397a = new C6397a();
        Cursor cursor = null;
        try {
            try {
                Cursor query = z().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    Map emptyMap = Collections.emptyMap();
                    query.close();
                    return emptyMap;
                }
                do {
                    try {
                        com.google.android.gms.internal.measurement.K1 k12 = (com.google.android.gms.internal.measurement.K1) ((AbstractC5010r4) ((K1.a) Z5.E(com.google.android.gms.internal.measurement.K1.K(), query.getBlob(1))).u());
                        if (k12.S()) {
                            int i8 = query.getInt(0);
                            List list = (List) c6397a.get(Integer.valueOf(i8));
                            if (list == null) {
                                list = new ArrayList();
                                c6397a.put(Integer.valueOf(i8), list);
                            }
                            list.add(k12);
                        }
                    } catch (IOException e8) {
                        h().E().c("Failed to merge filter. appId", C5378n2.t(str), e8);
                    }
                } while (query.moveToNext());
                query.close();
                return c6397a;
            } catch (SQLiteException e9) {
                h().E().c("Database error querying filters. appId", C5378n2.t(str), e9);
                Map emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    final Map Z0(String str) {
        s();
        l();
        Z2.r.f(str);
        C6397a c6397a = new C6397a();
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = z().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str, str});
                if (!rawQuery.moveToFirst()) {
                    Map emptyMap = Collections.emptyMap();
                    rawQuery.close();
                    return emptyMap;
                }
                do {
                    int i8 = rawQuery.getInt(0);
                    List list = (List) c6397a.get(Integer.valueOf(i8));
                    if (list == null) {
                        list = new ArrayList();
                        c6397a.put(Integer.valueOf(i8), list);
                    }
                    list.add(Integer.valueOf(rawQuery.getInt(1)));
                } while (rawQuery.moveToNext());
                rawQuery.close();
                return c6397a;
            } catch (SQLiteException e8) {
                h().E().c("Database error querying scoped filters. appId", C5378n2.t(str), e8);
                Map emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    final void a0(String str, List list) {
        boolean z7;
        boolean z8;
        Z2.r.l(list);
        for (int i8 = 0; i8 < list.size(); i8++) {
            J1.a aVar = (J1.a) ((com.google.android.gms.internal.measurement.J1) list.get(i8)).y();
            if (aVar.y() != 0) {
                for (int i9 = 0; i9 < aVar.y(); i9++) {
                    K1.a aVar2 = (K1.a) aVar.B(i9).y();
                    K1.a aVar3 = (K1.a) ((AbstractC5010r4.b) aVar2.clone());
                    String b8 = w3.q.b(aVar2.C());
                    if (b8 != null) {
                        aVar3.A(b8);
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    for (int i10 = 0; i10 < aVar2.y(); i10++) {
                        com.google.android.gms.internal.measurement.L1 B7 = aVar2.B(i10);
                        String a8 = w3.s.a(B7.L());
                        if (a8 != null) {
                            aVar3.z(i10, (com.google.android.gms.internal.measurement.L1) ((AbstractC5010r4) ((L1.a) B7.y()).y(a8).u()));
                            z8 = true;
                        }
                    }
                    if (z8) {
                        J1.a z9 = aVar.z(i9, aVar3);
                        list.set(i8, (com.google.android.gms.internal.measurement.J1) ((AbstractC5010r4) z9.u()));
                        aVar = z9;
                    }
                }
            }
            if (aVar.C() != 0) {
                for (int i11 = 0; i11 < aVar.C(); i11++) {
                    com.google.android.gms.internal.measurement.N1 D7 = aVar.D(i11);
                    String a9 = w3.r.a(D7.K());
                    if (a9 != null) {
                        aVar = aVar.A(i11, ((N1.a) D7.y()).y(a9));
                        list.set(i8, (com.google.android.gms.internal.measurement.J1) ((AbstractC5010r4) aVar.u()));
                    }
                }
            }
        }
        s();
        l();
        Z2.r.f(str);
        Z2.r.l(list);
        SQLiteDatabase z10 = z();
        z10.beginTransaction();
        try {
            s();
            l();
            Z2.r.f(str);
            SQLiteDatabase z11 = z();
            z11.delete("property_filters", "app_id=?", new String[]{str});
            z11.delete("event_filters", "app_id=?", new String[]{str});
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.measurement.J1 j12 = (com.google.android.gms.internal.measurement.J1) it.next();
                s();
                l();
                Z2.r.f(str);
                Z2.r.l(j12);
                if (j12.P()) {
                    int k8 = j12.k();
                    Iterator it2 = j12.N().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (!((com.google.android.gms.internal.measurement.K1) it2.next()).T()) {
                                h().J().c("Event filter with no ID. Audience definition ignored. appId, audienceId", C5378n2.t(str), Integer.valueOf(k8));
                                break;
                            }
                        } else {
                            Iterator it3 = j12.O().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    if (!((com.google.android.gms.internal.measurement.N1) it3.next()).O()) {
                                        h().J().c("Property filter with no ID. Audience definition ignored. appId, audienceId", C5378n2.t(str), Integer.valueOf(k8));
                                        break;
                                    }
                                } else {
                                    Iterator it4 = j12.N().iterator();
                                    while (true) {
                                        if (it4.hasNext()) {
                                            if (!h0(str, k8, (com.google.android.gms.internal.measurement.K1) it4.next())) {
                                                z7 = false;
                                                break;
                                            }
                                        } else {
                                            z7 = true;
                                            break;
                                        }
                                    }
                                    if (z7) {
                                        Iterator it5 = j12.O().iterator();
                                        while (true) {
                                            if (it5.hasNext()) {
                                                if (!i0(str, k8, (com.google.android.gms.internal.measurement.N1) it5.next())) {
                                                    z7 = false;
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                    }
                                    if (!z7) {
                                        s();
                                        l();
                                        Z2.r.f(str);
                                        SQLiteDatabase z12 = z();
                                        z12.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(k8)});
                                        z12.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(k8)});
                                    }
                                }
                            }
                        }
                    }
                } else {
                    h().J().b("Audience with no ID. appId", C5378n2.t(str));
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it6 = list.iterator();
            while (it6.hasNext()) {
                com.google.android.gms.internal.measurement.J1 j13 = (com.google.android.gms.internal.measurement.J1) it6.next();
                arrayList.add(j13.P() ? Integer.valueOf(j13.k()) : null);
            }
            E0(str, arrayList);
            z10.setTransactionSuccessful();
            z10.endTransaction();
        } catch (Throwable th) {
            z10.endTransaction();
            throw th;
        }
    }

    public final void a1() {
        s();
        z().beginTransaction();
    }

    final void b0(List list) {
        l();
        s();
        Z2.r.l(list);
        Z2.r.n(list.size());
        if (m0()) {
            String str = "(" + TextUtils.join(",", list) + ")";
            if (A0("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                h().J().a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                z().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e8) {
                h().E().b("Error incrementing retry count. error", e8);
            }
        }
    }

    public final void b1(String str) {
        l();
        s();
        try {
            z().execSQL("delete from default_event_params where app_id=?", new String[]{str});
        } catch (SQLiteException e8) {
            h().E().b("Error clearing default event params", e8);
        }
    }

    public final void c1(String str) {
        A J02;
        T0("events_snapshot", str);
        Cursor cursor = null;
        try {
            try {
                cursor = z().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return;
                }
                do {
                    String string = cursor.getString(0);
                    if (string != null && (J02 = J0(str, string)) != null) {
                        X("events_snapshot", J02);
                    }
                } while (cursor.moveToNext());
                cursor.close();
            } catch (SQLiteException e8) {
                h().E().c("Error creating snapshot. appId", C5378n2.t(str), e8);
                if (cursor != null) {
                    cursor.close();
                }
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final boolean d0(C5001q2 c5001q2, boolean z7) {
        l();
        s();
        Z2.r.l(c5001q2);
        Z2.r.f(c5001q2.x2());
        Z2.r.p(c5001q2.L0());
        h1();
        long a8 = zzb().a();
        if (c5001q2.c2() < a8 - C5326g.N() || c5001q2.c2() > C5326g.N() + a8) {
            h().J().d("Storing bundle outside of the max uploading time span. appId, now, timestamp", C5378n2.t(c5001q2.x2()), Long.valueOf(a8), Long.valueOf(c5001q2.c2()));
        }
        try {
            byte[] f02 = m().f0(c5001q2.j());
            h().I().b("Saving bundle, size", Integer.valueOf(f02.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", c5001q2.x2());
            contentValues.put("bundle_end_timestamp", Long.valueOf(c5001q2.c2()));
            contentValues.put("data", f02);
            contentValues.put("has_realtime", Integer.valueOf(z7 ? 1 : 0));
            if (c5001q2.S0()) {
                contentValues.put("retry_count", Integer.valueOf(c5001q2.B1()));
            }
            try {
                if (z().insert("queue", null, contentValues) != -1) {
                    return true;
                }
                h().E().b("Failed to insert bundle (got -1). appId", C5378n2.t(c5001q2.x2()));
                return false;
            } catch (SQLiteException e8) {
                h().E().c("Error storing bundle. appId", C5378n2.t(c5001q2.x2()), e8);
                return false;
            }
        } catch (IOException e9) {
            h().E().c("Data loss. Failed to serialize bundle. appId", C5378n2.t(c5001q2.x2()), e9);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d1(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5354k.d1(java.lang.String):void");
    }

    public final boolean e0(C5312e c5312e) {
        Z2.r.l(c5312e);
        l();
        s();
        String str = c5312e.f30921o;
        Z2.r.l(str);
        if (L0(str, c5312e.f30923t.f30790s) == null && A0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str}) >= 1000) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", c5312e.f30922s);
        contentValues.put("name", c5312e.f30923t.f30790s);
        R(contentValues, "value", Z2.r.l(c5312e.f30923t.A0()));
        contentValues.put("active", Boolean.valueOf(c5312e.f30925v));
        contentValues.put("trigger_event_name", c5312e.f30926w);
        contentValues.put("trigger_timeout", Long.valueOf(c5312e.f30928y));
        g();
        contentValues.put("timed_out_event", d6.o0(c5312e.f30927x));
        contentValues.put("creation_timestamp", Long.valueOf(c5312e.f30924u));
        g();
        contentValues.put("triggered_event", d6.o0(c5312e.f30929z));
        contentValues.put("triggered_timestamp", Long.valueOf(c5312e.f30923t.f30791t));
        contentValues.put("time_to_live", Long.valueOf(c5312e.f30919A));
        g();
        contentValues.put("expired_event", d6.o0(c5312e.f30920B));
        try {
            if (z().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            h().E().b("Failed to insert/update conditional user property (got -1)", C5378n2.t(str));
            return true;
        } catch (SQLiteException e8) {
            h().E().c("Error storing conditional user property", C5378n2.t(str), e8);
            return true;
        }
    }

    public final boolean e1(String str) {
        if (n7.a() && !a().r(G.f30375C0)) {
            return false;
        }
        String x02 = x0();
        StringBuilder sb = new StringBuilder("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=? AND NOT ");
        sb.append(x02);
        return A0(sb.toString(), new String[]{str}) != 0;
    }

    public final boolean f0(B b8, long j8, boolean z7) {
        l();
        s();
        Z2.r.l(b8);
        Z2.r.f(b8.f30282a);
        byte[] j9 = m().C(b8).j();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", b8.f30282a);
        contentValues.put("name", b8.f30283b);
        contentValues.put("timestamp", Long.valueOf(b8.f30285d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j8));
        contentValues.put("data", j9);
        contentValues.put("realtime", Integer.valueOf(z7 ? 1 : 0));
        try {
            if (z().insert("raw_events", null, contentValues) != -1) {
                return true;
            }
            h().E().b("Failed to insert raw event (got -1). appId", C5378n2.t(b8.f30282a));
            return false;
        } catch (SQLiteException e8) {
            h().E().c("Error storing raw event. appId", C5378n2.t(b8.f30282a), e8);
            return false;
        }
    }

    final boolean f1(String str) {
        boolean z7;
        boolean z8;
        Cursor cursor = null;
        try {
            try {
                cursor = z().rawQuery("select timestamp from raw_events where app_id=? and name = '_f' limit 1;", new String[]{str});
            } catch (SQLiteException e8) {
                e = e8;
                z7 = false;
            }
            if (!cursor.moveToFirst()) {
                cursor.close();
                return false;
            }
            z7 = zzb().a() < cursor.getLong(0) + 15000;
            try {
                z8 = E("select count(*) from raw_events where app_id=? and name not like '!_%' escape '!' limit 1;", new String[]{str}, 0L) > 0;
                cursor.close();
            } catch (SQLiteException e9) {
                e = e9;
                h().E().b("Error checking backfill conditions", e);
                z8 = false;
                if (z7) {
                }
            }
            return (z7 || z8) ? false : true;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    public final boolean g0(a6 a6Var) {
        Z2.r.l(a6Var);
        l();
        s();
        if (L0(a6Var.f30820a, a6Var.f30822c) == null) {
            if (d6.I0(a6Var.f30822c)) {
                if (A0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{a6Var.f30820a}) >= a().o(a6Var.f30820a, G.f30388J, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(a6Var.f30822c) && A0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{a6Var.f30820a, a6Var.f30821b}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", a6Var.f30820a);
        contentValues.put("origin", a6Var.f30821b);
        contentValues.put("name", a6Var.f30822c);
        contentValues.put("set_timestamp", Long.valueOf(a6Var.f30823d));
        R(contentValues, "value", a6Var.f30824e);
        try {
            if (z().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            h().E().b("Failed to insert/update user property (got -1). appId", C5378n2.t(a6Var.f30820a));
            return true;
        } catch (SQLiteException e8) {
            h().E().c("Error storing user property. appId", C5378n2.t(a6Var.f30820a), e8);
            return true;
        }
    }

    public final void g1() {
        s();
        z().endTransaction();
    }

    final void h1() {
        int delete;
        l();
        s();
        if (m0()) {
            long a8 = q().f31018e.a();
            long b8 = zzb().b();
            if (Math.abs(b8 - a8) > C5326g.O()) {
                q().f31018e.b(b8);
                l();
                s();
                if (!m0() || (delete = z().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(zzb().a()), String.valueOf(C5326g.N())})) <= 0) {
                    return;
                }
                h().I().b("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
            }
        }
    }

    public final void i1() {
        s();
        z().setTransactionSuccessful();
    }

    public final boolean j0(String str, C4993p2 c4993p2, String str2, Map map, w3.C c8) {
        int delete;
        l();
        s();
        Z2.r.l(c4993p2);
        Z2.r.f(str);
        if (n7.a() && !a().r(G.f30375C0)) {
            return false;
        }
        l();
        s();
        if (m0()) {
            long a8 = q().f31019f.a();
            long b8 = zzb().b();
            if (Math.abs(b8 - a8) > C5326g.O()) {
                q().f31019f.b(b8);
                l();
                s();
                if (m0() && (delete = z().delete("upload_queue", x0(), new String[0])) > 0) {
                    h().I().b("Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted", Integer.valueOf(delete));
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(((String) entry.getKey()) + "=" + ((String) entry.getValue()));
        }
        byte[] j8 = c4993p2.j();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", j8);
        contentValues.put("upload_uri", str2);
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        if (size > 0) {
            sb.append((CharSequence) arrayList.get(0));
            int i8 = 1;
            while (i8 < size) {
                sb.append((CharSequence) "\r\n");
                Object obj = arrayList.get(i8);
                i8++;
                sb.append((CharSequence) obj);
            }
        }
        contentValues.put("upload_headers", sb.toString());
        contentValues.put("upload_type", Integer.valueOf(c8.zza()));
        contentValues.put("creation_timestamp", Long.valueOf(zzb().a()));
        contentValues.put("retry_count", (Integer) 0);
        try {
            if (z().insert("upload_queue", null, contentValues) != -1) {
                return true;
            }
            h().E().b("Failed to insert MeasurementBatch (got -1) to upload_queue. appId", str);
            return false;
        } catch (SQLiteException e8) {
            h().E().c("Error storing MeasurementBatch to upload_queue. appId", str, e8);
            return false;
        }
    }

    public final boolean j1() {
        return A0("select count(1) > 0 from raw_events", null) != 0;
    }

    public final boolean k0(String str, B5 b52) {
        l();
        s();
        Z2.r.l(b52);
        Z2.r.f(str);
        long a8 = zzb().a();
        long j8 = b52.f30299s;
        C5294b2 c5294b2 = G.f30447i0;
        if (j8 < a8 - ((Long) c5294b2.a(null)).longValue() || b52.f30299s > ((Long) c5294b2.a(null)).longValue() + a8) {
            h().J().d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", C5378n2.t(str), Long.valueOf(a8), Long.valueOf(b52.f30299s));
        }
        h().I().a("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", b52.f30298o);
        contentValues.put("source", Integer.valueOf(b52.f30300t));
        contentValues.put("timestamp_millis", Long.valueOf(b52.f30299s));
        try {
            if (z().insert("trigger_uris", null, contentValues) != -1) {
                return true;
            }
            h().E().b("Failed to insert trigger URI (got -1). appId", C5378n2.t(str));
            return false;
        } catch (SQLiteException e8) {
            h().E().c("Error storing trigger URI. appId", C5378n2.t(str), e8);
            return false;
        }
    }

    public final boolean k1() {
        return A0("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    public final boolean l0(String str, Long l8, long j8, C4961l2 c4961l2) {
        l();
        s();
        Z2.r.l(c4961l2);
        Z2.r.f(str);
        Z2.r.l(l8);
        byte[] j9 = c4961l2.j();
        h().I().c("Saving complex main event, appId, data size", e().c(str), Integer.valueOf(j9.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l8);
        contentValues.put("children_to_process", Long.valueOf(j8));
        contentValues.put("main_event", j9);
        try {
            if (z().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            h().E().b("Failed to insert complex main event (got -1). appId", C5378n2.t(str));
            return false;
        } catch (SQLiteException e8) {
            h().E().c("Error storing complex main event. appId", C5378n2.t(str), e8);
            return false;
        }
    }

    public final boolean l1() {
        return A0("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    protected final boolean m0() {
        return zza().getDatabasePath("google_app_measurement.db").exists();
    }

    @Override // com.google.android.gms.measurement.internal.E5
    protected final boolean v() {
        return false;
    }

    public final long w() {
        Cursor cursor = null;
        try {
            try {
                cursor = z().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return -1L;
                }
                long j8 = cursor.getLong(0);
                cursor.close();
                return j8;
            } catch (SQLiteException e8) {
                h().E().b("Error querying raw events", e8);
                if (cursor != null) {
                    cursor.close();
                }
                return -1L;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long x() {
        return E("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    public final long y() {
        return E("select max(timestamp) from raw_events", null, 0L);
    }

    public final long y0(String str) {
        Z2.r.f(str);
        l();
        s();
        return E("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
    }

    final SQLiteDatabase z() {
        l();
        try {
            return this.f31042d.getWritableDatabase();
        } catch (SQLiteException e8) {
            h().J().b("Error opening database", e8);
            throw e8;
        }
    }

    protected final long z0(String str, String str2) {
        Z2.r.f(str);
        Z2.r.f(str2);
        l();
        s();
        SQLiteDatabase z7 = z();
        z7.beginTransaction();
        long j8 = 0;
        try {
            try {
                long E7 = E("select " + str2 + " from app2 where app_id=?", new String[]{str}, -1L);
                if (E7 == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (z7.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        h().E().c("Failed to insert column (got -1). appId", C5378n2.t(str), str2);
                        return -1L;
                    }
                    E7 = 0;
                }
                try {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put(str2, Long.valueOf(1 + E7));
                    if (z7.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                        h().E().c("Failed to update column (got 0). appId", C5378n2.t(str), str2);
                        return -1L;
                    }
                    z7.setTransactionSuccessful();
                    return E7;
                } catch (SQLiteException e8) {
                    long j9 = E7;
                    e = e8;
                    j8 = j9;
                    h().E().d("Error inserting column. appId", C5378n2.t(str), str2, e);
                    z7.endTransaction();
                    return j8;
                }
            } catch (SQLiteException e9) {
                e = e9;
            }
        } finally {
            z7.endTransaction();
        }
    }
}
