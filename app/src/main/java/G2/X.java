package G2;

import D2.C0555y;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.gms.internal.ads.AbstractC1232Df0;
import com.google.android.gms.internal.ads.AbstractC3184kf;
import com.google.android.gms.internal.ads.C2970ig0;
import com.google.android.gms.internal.ads.C3785q60;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class X {
    public static Point a(MotionEvent motionEvent, View view) {
        int[] j8 = j(view);
        return new Point(((int) motionEvent.getRawX()) - j8[0], ((int) motionEvent.getRawY()) - j8[1]);
    }

    public static WindowManager.LayoutParams b() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) D2.A.c().a(AbstractC3184kf.U7)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    public static JSONObject c(String str, Context context, Point point, Point point2) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("x", C0555y.b().f(context, point2.x));
                    jSONObject3.put("y", C0555y.b().f(context, point2.y));
                    jSONObject3.put("start_x", C0555y.b().f(context, point.x));
                    jSONObject3.put("start_y", C0555y.b().f(context, point.y));
                    jSONObject = jSONObject3;
                } catch (JSONException e8) {
                    H2.p.e("Error occurred while putting signals into JSON object.", e8);
                }
                jSONObject2.put("click_point", jSONObject);
                jSONObject2.put("asset_id", str);
                return jSONObject2;
            } catch (Exception e9) {
                e = e9;
                jSONObject = jSONObject2;
                H2.p.e("Error occurred while grabbing click signals.", e);
                return jSONObject;
            }
        } catch (Exception e10) {
            e = e10;
        }
    }

    public static JSONObject d(Context context, Map map, Map map2, View view, ImageView.ScaleType scaleType) {
        String str;
        String str2;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        String str3 = "ad_view";
        String str4 = "relative_to";
        JSONObject jSONObject3 = new JSONObject();
        if (map != null && view != null) {
            int[] j8 = j(view);
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                View view2 = (View) ((WeakReference) entry.getValue()).get();
                if (view2 != null) {
                    int[] j9 = j(view2);
                    JSONObject jSONObject4 = new JSONObject();
                    JSONObject jSONObject5 = new JSONObject();
                    Iterator it2 = it;
                    try {
                        JSONObject jSONObject6 = jSONObject3;
                        try {
                            jSONObject5.put("width", C0555y.b().f(context, view2.getMeasuredWidth()));
                            jSONObject5.put("height", C0555y.b().f(context, view2.getMeasuredHeight()));
                            jSONObject5.put("x", C0555y.b().f(context, j9[0] - j8[0]));
                            jSONObject5.put("y", C0555y.b().f(context, j9[1] - j8[1]));
                            jSONObject5.put(str4, str3);
                            jSONObject4.put("frame", jSONObject5);
                            Rect rect = new Rect();
                            if (view2.getLocalVisibleRect(rect)) {
                                jSONObject2 = k(context, rect);
                            } else {
                                jSONObject2 = new JSONObject();
                                jSONObject2.put("width", 0);
                                jSONObject2.put("height", 0);
                                jSONObject2.put("x", C0555y.b().f(context, j9[0] - j8[0]));
                                jSONObject2.put("y", C0555y.b().f(context, j9[1] - j8[1]));
                                jSONObject2.put(str4, str3);
                            }
                            jSONObject4.put("visible_bounds", jSONObject2);
                            if (((String) entry.getKey()).equals("3010")) {
                                if (((Boolean) D2.A.c().a(AbstractC3184kf.O7)).booleanValue()) {
                                    jSONObject4.put("mediaview_graphics_matrix", view2.getMatrix().toShortString());
                                }
                                if (((Boolean) D2.A.c().a(AbstractC3184kf.P7)).booleanValue()) {
                                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                    jSONObject4.put("view_width_layout_type", l(layoutParams.width) - 1);
                                    jSONObject4.put("view_height_layout_type", l(layoutParams.height) - 1);
                                }
                                if (((Boolean) D2.A.c().a(AbstractC3184kf.Q7)).booleanValue()) {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(Integer.valueOf(view2.getId()));
                                    for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        arrayList.add(Integer.valueOf(((View) parent).getId()));
                                    }
                                    jSONObject4.put("view_path", TextUtils.join("/", arrayList));
                                }
                                if (scaleType != null) {
                                    jSONObject4.put("mediaview_scale_type", scaleType.ordinal());
                                }
                            }
                            if (view2 instanceof TextView) {
                                TextView textView = (TextView) view2;
                                jSONObject4.put("text_color", textView.getCurrentTextColor());
                                str = str3;
                                str2 = str4;
                                try {
                                    jSONObject4.put("font_size", textView.getTextSize());
                                    jSONObject4.put("text", textView.getText());
                                } catch (JSONException unused) {
                                    jSONObject = jSONObject6;
                                    H2.p.g("Unable to get asset views information");
                                    it = it2;
                                    jSONObject3 = jSONObject;
                                    str3 = str;
                                    str4 = str2;
                                }
                            } else {
                                str = str3;
                                str2 = str4;
                            }
                            jSONObject4.put("is_clickable", map2 != null && map2.containsKey(entry.getKey()) && view2.isClickable());
                            jSONObject = jSONObject6;
                        } catch (JSONException unused2) {
                            str = str3;
                            str2 = str4;
                        }
                        try {
                            jSONObject.put((String) entry.getKey(), jSONObject4);
                        } catch (JSONException unused3) {
                            H2.p.g("Unable to get asset views information");
                            it = it2;
                            jSONObject3 = jSONObject;
                            str3 = str;
                            str4 = str2;
                        }
                    } catch (JSONException unused4) {
                        str = str3;
                        str2 = str4;
                        jSONObject = jSONObject3;
                    }
                    it = it2;
                    jSONObject3 = jSONObject;
                    str3 = str;
                    str4 = str2;
                }
            }
        }
        return jSONObject3;
    }

    public static JSONObject e(Context context, View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                C2.v.t();
                jSONObject.put("can_show_on_lock_screen", D0.T(view));
                C2.v.t();
                jSONObject.put("is_keyguard_locked", D0.e(context));
            } catch (JSONException unused) {
                H2.p.g("Unable to get lock screen information");
            }
        }
        return jSONObject;
    }

    public static JSONObject f(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                if (((Boolean) D2.A.c().a(AbstractC3184kf.N7)).booleanValue()) {
                    C2.v.t();
                    ViewParent parent = view.getParent();
                    while (parent != null && !(parent instanceof ScrollView)) {
                        parent = parent.getParent();
                    }
                    jSONObject.put("contained_in_scroll_view", parent != null);
                } else {
                    C2.v.t();
                    ViewParent parent2 = view.getParent();
                    while (parent2 != null && !(parent2 instanceof AdapterView)) {
                        parent2 = parent2.getParent();
                    }
                    if ((parent2 == null ? -1 : ((AdapterView) parent2).getPositionForView(view)) == -1) {
                        r2 = false;
                    }
                    jSONObject.put("contained_in_scroll_view", r2);
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015e A[Catch: JSONException -> 0x0157, TRY_LEAVE, TryCatch #1 {JSONException -> 0x0157, blocks: (B:29:0x0128, B:46:0x0153, B:49:0x0159, B:50:0x015e), top: B:63:0x0128 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.json.JSONObject g(android.content.Context r16, android.view.View r17) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: G2.X.g(android.content.Context, android.view.View):org.json.JSONObject");
    }

    public static boolean h(Context context, C3785q60 c3785q60) {
        if (!c3785q60.f25765N) {
            return false;
        }
        if (((Boolean) D2.A.c().a(AbstractC3184kf.R7)).booleanValue()) {
            return ((Boolean) D2.A.c().a(AbstractC3184kf.V7)).booleanValue();
        }
        String str = (String) D2.A.c().a(AbstractC3184kf.S7);
        if (!str.isEmpty() && context != null) {
            String packageName = context.getPackageName();
            Iterator it = C2970ig0.b(AbstractC1232Df0.c(';')).d(str).iterator();
            while (it.hasNext()) {
                if (((String) it.next()).equals(packageName)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean i(int i8) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23642B3)).booleanValue()) {
            return ((Boolean) D2.A.c().a(AbstractC3184kf.f23650C3)).booleanValue() || i8 <= 15299999;
        }
        return true;
    }

    public static int[] j(View view) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return iArr;
    }

    private static JSONObject k(Context context, Rect rect) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", C0555y.b().f(context, rect.right - rect.left));
        jSONObject.put("height", C0555y.b().f(context, rect.bottom - rect.top));
        jSONObject.put("x", C0555y.b().f(context, rect.left));
        jSONObject.put("y", C0555y.b().f(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    private static int l(int i8) {
        if (i8 != -2) {
            return i8 != -1 ? 2 : 3;
        }
        return 4;
    }
}
