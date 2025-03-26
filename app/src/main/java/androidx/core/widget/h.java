package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import x0.m;

/* loaded from: classes.dex */
public abstract class h {

    static class a {
        static int a(TextView textView) {
            return textView.getBreakStrategy();
        }

        static int b(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        static void c(TextView textView, int i8) {
            textView.setBreakStrategy(i8);
        }

        static void d(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        static void e(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        static void f(TextView textView, int i8) {
            textView.setHyphenationFrequency(i8);
        }
    }

    static class b {
        static DecimalFormatSymbols a(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    static class c {
        static String[] a(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        static PrecomputedText.Params b(TextView textView) {
            return textView.getTextMetricsParams();
        }

        static void c(TextView textView, int i8) {
            textView.setFirstBaselineToTopHeight(i8);
        }
    }

    static class d {
        public static void a(TextView textView, int i8, float f8) {
            textView.setLineHeight(i8, f8);
        }
    }

    private static class e implements ActionMode.Callback {

        /* renamed from: a, reason: collision with root package name */
        private final ActionMode.Callback f9274a;

        /* renamed from: b, reason: collision with root package name */
        private final TextView f9275b;

        /* renamed from: c, reason: collision with root package name */
        private Class f9276c;

        /* renamed from: d, reason: collision with root package name */
        private Method f9277d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f9278e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f9279f = false;

        e(ActionMode.Callback callback, TextView textView) {
            this.f9274a = callback;
            this.f9275b = textView;
        }

        private Intent a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        private Intent b(ResolveInfo resolveInfo, TextView textView) {
            Intent putExtra = a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !e(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return putExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        private List c(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (!(context instanceof Activity)) {
                return arrayList;
            }
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(a(), 0)) {
                if (f(resolveInfo, context)) {
                    arrayList.add(resolveInfo);
                }
            }
            return arrayList;
        }

        private boolean e(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        private boolean f(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            return str == null || context.checkSelfPermission(str) == 0;
        }

        private void g(Menu menu) {
            Context context = this.f9275b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f9279f) {
                this.f9279f = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f9276c = cls;
                    this.f9277d = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.f9278e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f9276c = null;
                    this.f9277d = null;
                    this.f9278e = false;
                }
            }
            try {
                Method declaredMethod = (this.f9278e && this.f9276c.isInstance(menu)) ? this.f9277d : menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                List c8 = c(context, packageManager);
                for (int i8 = 0; i8 < c8.size(); i8++) {
                    ResolveInfo resolveInfo = (ResolveInfo) c8.get(i8);
                    menu.add(0, 0, i8 + 100, resolveInfo.loadLabel(packageManager)).setIntent(b(resolveInfo, this.f9275b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        ActionMode.Callback d() {
            return this.f9274a;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f9274a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f9274a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f9274a.onDestroyActionMode(actionMode);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            g(menu);
            return this.f9274a.onPrepareActionMode(actionMode, menu);
        }
    }

    public static Drawable[] a(TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }

    public static int b(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    public static int c(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    public static int d(TextView textView) {
        return textView.getMaxLines();
    }

    private static int e(TextDirectionHeuristic textDirectionHeuristic) {
        TextDirectionHeuristic textDirectionHeuristic2;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        if (textDirectionHeuristic == textDirectionHeuristic3 || textDirectionHeuristic == (textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == textDirectionHeuristic2) {
            return 6;
        }
        return textDirectionHeuristic == textDirectionHeuristic3 ? 7 : 1;
    }

    private static TextDirectionHeuristic f(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        if (Build.VERSION.SDK_INT >= 28 && (textView.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(c.a(b.a(textView.getTextLocale()))[0].codePointAt(0));
            return (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        boolean z7 = textView.getLayoutDirection() == 1;
        switch (textView.getTextDirection()) {
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                if (!z7) {
                    break;
                } else {
                    break;
                }
        }
        return TextDirectionHeuristics.LTR;
    }

    public static m.a g(TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new m.a(c.b(textView));
        }
        m.a.C0347a c0347a = new m.a.C0347a(new TextPaint(textView.getPaint()));
        c0347a.b(a.a(textView));
        c0347a.c(a.b(textView));
        c0347a.d(f(textView));
        return c0347a.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void h(TextView textView, ColorStateList colorStateList) {
        y0.i.g(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            a.d(textView, colorStateList);
        } else if (textView instanceof k) {
            ((k) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void i(TextView textView, PorterDuff.Mode mode) {
        y0.i.g(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            a.e(textView, mode);
        } else if (textView instanceof k) {
            ((k) textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }

    public static void j(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    public static void k(TextView textView, int i8) {
        y0.i.d(i8);
        if (Build.VERSION.SDK_INT >= 28) {
            c.c(textView, i8);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i9 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i8 > Math.abs(i9)) {
            textView.setPadding(textView.getPaddingLeft(), i8 + i9, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void l(TextView textView, int i8) {
        y0.i.d(i8);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i9 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i8 > Math.abs(i9)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i8 - i9);
        }
    }

    public static void m(TextView textView, int i8) {
        y0.i.d(i8);
        if (i8 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i8 - r0, 1.0f);
        }
    }

    public static void n(TextView textView, int i8, float f8) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.a(textView, i8, f8);
        } else {
            m(textView, Math.round(TypedValue.applyDimension(i8, f8, textView.getResources().getDisplayMetrics())));
        }
    }

    public static void o(TextView textView, m mVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        g(textView);
        throw null;
    }

    public static void p(TextView textView, int i8) {
        textView.setTextAppearance(i8);
    }

    public static void q(TextView textView, m.a aVar) {
        textView.setTextDirection(e(aVar.d()));
        textView.getPaint().set(aVar.e());
        a.c(textView, aVar.b());
        a.f(textView, aVar.c());
    }

    public static ActionMode.Callback r(ActionMode.Callback callback) {
        return (!(callback instanceof e) || Build.VERSION.SDK_INT < 26) ? callback : ((e) callback).d();
    }

    public static ActionMode.Callback s(TextView textView, ActionMode.Callback callback) {
        int i8 = Build.VERSION.SDK_INT;
        return (i8 < 26 || i8 > 27 || (callback instanceof e) || callback == null) ? callback : new e(callback, textView);
    }
}
