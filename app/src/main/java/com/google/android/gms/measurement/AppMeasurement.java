package com.google.android.gms.measurement;

import Z2.r;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.C4871b1;
import com.google.android.gms.measurement.internal.S2;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import w3.o;
import w3.z;

@Deprecated
/* loaded from: classes2.dex */
public class AppMeasurement {

    /* renamed from: b, reason: collision with root package name */
    private static volatile AppMeasurement f30241b;

    /* renamed from: a, reason: collision with root package name */
    private final a f30242a;

    public static class ConditionalUserProperty {

        @Keep
        public boolean mActive;

        @Keep
        public String mAppId;

        @Keep
        public long mCreationTimestamp;

        @Keep
        public String mExpiredEventName;

        @Keep
        public Bundle mExpiredEventParams;

        @Keep
        public String mName;

        @Keep
        public String mOrigin;

        @Keep
        public long mTimeToLive;

        @Keep
        public String mTimedOutEventName;

        @Keep
        public Bundle mTimedOutEventParams;

        @Keep
        public String mTriggerEventName;

        @Keep
        public long mTriggerTimeout;

        @Keep
        public String mTriggeredEventName;

        @Keep
        public Bundle mTriggeredEventParams;

        @Keep
        public long mTriggeredTimestamp;

        @Keep
        public Object mValue;

        ConditionalUserProperty(Bundle bundle) {
            r.l(bundle);
            this.mAppId = (String) o.a(bundle, "app_id", String.class, null);
            this.mOrigin = (String) o.a(bundle, "origin", String.class, null);
            this.mName = (String) o.a(bundle, "name", String.class, null);
            this.mValue = o.a(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) o.a(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) o.a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) o.a(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) o.a(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) o.a(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) o.a(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) o.a(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) o.a(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) o.a(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) o.a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) o.a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) o.a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static abstract class a implements z {
        private a() {
        }
    }

    private AppMeasurement(S2 s22) {
        this.f30242a = new b(s22);
    }

    private static AppMeasurement a(Context context, String str, String str2) {
        if (f30241b == null) {
            synchronized (AppMeasurement.class) {
                try {
                    if (f30241b == null) {
                        z b8 = b(context, null);
                        if (b8 != null) {
                            f30241b = new AppMeasurement(b8);
                        } else {
                            f30241b = new AppMeasurement(S2.a(context, new C4871b1(0L, 0L, true, null, null, null, null, null), null));
                        }
                    }
                } finally {
                }
            }
        }
        return f30241b;
    }

    private static z b(Context context, Bundle bundle) {
        return (z) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
    }

    @Keep
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        return a(context, null, null);
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.f30242a.v(str);
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f30242a.a(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.f30242a.C(str);
    }

    @Keep
    public long generateEventId() {
        return this.f30242a.c();
    }

    @Keep
    public String getAppInstanceId() {
        return this.f30242a.g();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List b8 = this.f30242a.b(str, str2);
        ArrayList arrayList = new ArrayList(b8 == null ? 0 : b8.size());
        Iterator it = b8.iterator();
        while (it.hasNext()) {
            arrayList.add(new ConditionalUserProperty((Bundle) it.next()));
        }
        return arrayList;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.f30242a.e();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.f30242a.f();
    }

    @Keep
    public String getGmpAppId() {
        return this.f30242a.h();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        return this.f30242a.n(str);
    }

    @Keep
    protected Map<String, Object> getUserProperties(String str, String str2, boolean z7) {
        return this.f30242a.d(str, str2, z7);
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f30242a.i(str, str2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        r.l(conditionalUserProperty);
        a aVar = this.f30242a;
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            o.b(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        aVar.R(bundle);
    }

    private AppMeasurement(z zVar) {
        this.f30242a = new com.google.android.gms.measurement.a(zVar);
    }
}
