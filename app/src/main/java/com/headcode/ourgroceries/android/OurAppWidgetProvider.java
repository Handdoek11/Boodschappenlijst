package com.headcode.ourgroceries.android;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.widget.RemoteViews;
import com.headcode.ourgroceries.android.AbstractC5625q;
import com.headcode.ourgroceries.android.R4;
import q5.AbstractC6635a;

/* loaded from: classes2.dex */
public class OurAppWidgetProvider extends AppWidgetProvider {

    /* renamed from: a, reason: collision with root package name */
    private static SharedPreferences.OnSharedPreferenceChangeListener f34282a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final C5688z0 f34283a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f34284b;

        public a(C5688z0 c5688z0, boolean z7) {
            this.f34283a = c5688z0;
            this.f34284b = z7;
        }

        public String toString() {
            return "WidgetListInfo{mList=" + this.f34283a + ", mWidgetNeedsRefresh=" + this.f34284b + '}';
        }
    }

    private static String b(Context context, int i8) {
        return d(context, i8).getString("com.headcode.ourgroceries.android.LIST_ID_KEY", null);
    }

    public static String c(Context context, int i8) {
        return d(context, i8).getString("com.headcode.ourgroceries.android.LIST_NAME_KEY", null);
    }

    private static SharedPreferences d(Context context, int i8) {
        return context.getSharedPreferences("AppWidget-" + i8, 0);
    }

    public static void e(final Context context, A2 a22) {
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.headcode.ourgroceries.android.k2
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                OurAppWidgetProvider.g(context, sharedPreferences, str);
            }
        };
        f34282a = onSharedPreferenceChangeListener;
        a22.f0(onSharedPreferenceChangeListener);
    }

    public static boolean f(Context context, int i8) {
        return b(context, i8) == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g(Context context, SharedPreferences sharedPreferences, String str) {
        if (str.equals("theme")) {
            j(context, true);
        }
    }

    public static void h(Context context, int i8, String str, String str2) {
        d(context, i8).edit().putString("com.headcode.ourgroceries.android.LIST_ID_KEY", str).putString("com.headcode.ourgroceries.android.LIST_NAME_KEY", str2).apply();
    }

    public static a i(OurApplication ourApplication, int i8) {
        String b8 = b(ourApplication, i8);
        String c8 = c(ourApplication, i8);
        C5688z0 x7 = ourApplication.i().x(b8);
        boolean z7 = true;
        if (x7 == null) {
            AbstractC6635a.f("OG-Widget", "List " + b8 + " not found for widget " + i8);
            C5688z0 y7 = ourApplication.i().y(c8);
            if (y7 == null) {
                AbstractC6635a.f("OG-Widget", "List \"" + c8 + "\" not found for widget");
            } else {
                AbstractC6635a.d("OG-Widget", "List \"" + c8 + "\" is now " + y7.T());
                h(ourApplication, i8, y7.T(), y7.W());
            }
            x7 = y7;
        } else if (c8 == null || !c8.equals(x7.W())) {
            h(ourApplication, i8, x7.T(), x7.W());
        } else {
            z7 = false;
        }
        return new a(x7, z7);
    }

    public static void j(Context context, boolean z7) {
        ComponentName componentName = new ComponentName(context, (Class<?>) OurAppWidgetProvider.class);
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        int[] appWidgetIds = appWidgetManager.getAppWidgetIds(componentName);
        OurApplication ourApplication = OurApplication.f34286H;
        if (ourApplication != null) {
            for (int i8 : appWidgetIds) {
                if (i(ourApplication, i8).f34284b || z7) {
                    k(ourApplication, AppWidgetManager.getInstance(ourApplication), i8);
                }
            }
        }
        appWidgetManager.notifyAppWidgetViewDataChanged(appWidgetIds, H2.f33621v);
    }

    public static void k(Context context, AppWidgetManager appWidgetManager, int i8) {
        OurApplication ourApplication = OurApplication.f34286H;
        if (ourApplication == null) {
            AbstractC6635a.b("OG-Widget", "Application instance is null");
            return;
        }
        C5688z0 c5688z0 = i(ourApplication, i8).f34283a;
        if (c5688z0 == null) {
            l(context, i8);
            return;
        }
        R4.b d8 = R4.d(context);
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), d8.w() ? J2.f33705h : J2.f33703f);
        Intent intent = new Intent(context, (Class<?>) OurAppWidgetService.class);
        intent.putExtra("appWidgetId", i8);
        intent.setData(Uri.parse(intent.toUri(1)));
        remoteViews.setTextViewText(H2.f33627x, c5688z0.W());
        remoteViews.setRemoteAdapter(H2.f33621v, intent);
        remoteViews.setViewVisibility(H2.f33621v, 0);
        remoteViews.setViewVisibility(H2.f33624w, 8);
        n(context, d8, remoteViews);
        Intent b8 = AbstractC5625q.b(context, c5688z0.T(), c5688z0.U(), AbstractC5625q.b.VIEW);
        b8.putExtra("com.headcode.ourgroceries.FromWidget", true);
        remoteViews.setOnClickPendingIntent(H2.f33627x, PendingIntent.getActivities(context, 0, new Intent[]{AbstractC5625q.d(context), b8}, 201326592));
        Intent b9 = AbstractC5625q.b(context, c5688z0.T(), c5688z0.U(), AbstractC5625q.b.ADD_ITEM);
        b9.putExtra("com.headcode.ourgroceries.FromWidget", true);
        remoteViews.setOnClickPendingIntent(H2.f33612s, PendingIntent.getActivities(context, 0, new Intent[]{AbstractC5625q.d(context), b9}, 201326592));
        Intent intent2 = new Intent(context, (Class<?>) OurAppWidgetActionBroadcastReceiver.class);
        intent2.putExtra("com.headcode.ourgroceries.ListID", c5688z0.T());
        intent2.putExtra("com.headcode.ourgroceries.ListType", c5688z0.U().toString());
        intent2.setData(Uri.fromParts("ourgroceries", c5688z0.T(), "row-template"));
        remoteViews.setPendingIntentTemplate(H2.f33621v, PendingIntent.getBroadcast(context, 0, intent2, 134217728 | AbstractC5625q.f34975a));
        appWidgetManager.updateAppWidget(i8, remoteViews);
    }

    private static void l(Context context, int i8) {
        R4.b d8 = R4.d(context);
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), d8.w() ? J2.f33705h : J2.f33703f);
        String c8 = c(context, i8);
        if (c8 != null) {
            remoteViews.setTextViewText(H2.f33627x, c8);
        }
        remoteViews.setTextViewText(H2.f33624w, context.getString(M2.f33881H0));
        remoteViews.setViewVisibility(H2.f33612s, 8);
        remoteViews.setViewVisibility(H2.f33621v, 8);
        remoteViews.setViewVisibility(H2.f33624w, 0);
        n(context, d8, remoteViews);
        Intent d9 = AbstractC5625q.d(context);
        d9.putExtra("com.headcode.ourgroceries.FromWidget", true);
        PendingIntent activity = PendingIntent.getActivity(context, 0, d9, 201326592);
        remoteViews.setOnClickPendingIntent(H2.f33627x, activity);
        remoteViews.setOnClickPendingIntent(H2.f33624w, activity);
        AppWidgetManager.getInstance(context).updateAppWidget(i8, remoteViews);
    }

    public static void m(Context context, int i8) {
        AppWidgetManager.getInstance(context).notifyAppWidgetViewDataChanged(i8, H2.f33621v);
    }

    private static void n(Context context, R4.b bVar, RemoteViews remoteViews) {
        if (bVar.w()) {
            return;
        }
        remoteViews.setInt(H2.f33618u, "setBackgroundColor", context.getColor(bVar.h()));
        remoteViews.setTextColor(H2.f33627x, context.getColor(bVar.i()));
        remoteViews.setInt(H2.f33615t, "setBackgroundColor", context.getColor(bVar.m()));
        remoteViews.setTextColor(H2.f33624w, context.getColor(bVar.q()));
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onDeleted(Context context, int[] iArr) {
        for (int i8 : iArr) {
            AbstractC5673x.a("widgetDeleted");
            d(context, i8).edit().clear().apply();
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onEnabled(Context context) {
        j(context, true);
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        for (int i8 : iArr) {
            k(context, appWidgetManager, i8);
        }
    }
}
