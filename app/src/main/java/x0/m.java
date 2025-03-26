package x0;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public abstract class m implements Spannable {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final TextPaint f44401a;

        /* renamed from: b, reason: collision with root package name */
        private final TextDirectionHeuristic f44402b;

        /* renamed from: c, reason: collision with root package name */
        private final int f44403c;

        /* renamed from: d, reason: collision with root package name */
        private final int f44404d;

        /* renamed from: e, reason: collision with root package name */
        final PrecomputedText.Params f44405e;

        /* renamed from: x0.m$a$a, reason: collision with other inner class name */
        public static class C0347a {

            /* renamed from: a, reason: collision with root package name */
            private final TextPaint f44406a;

            /* renamed from: c, reason: collision with root package name */
            private int f44408c = 1;

            /* renamed from: d, reason: collision with root package name */
            private int f44409d = 1;

            /* renamed from: b, reason: collision with root package name */
            private TextDirectionHeuristic f44407b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public C0347a(TextPaint textPaint) {
                this.f44406a = textPaint;
            }

            public a a() {
                return new a(this.f44406a, this.f44407b, this.f44408c, this.f44409d);
            }

            public C0347a b(int i8) {
                this.f44408c = i8;
                return this;
            }

            public C0347a c(int i8) {
                this.f44409d = i8;
                return this;
            }

            public C0347a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f44407b = textDirectionHeuristic;
                return this;
            }
        }

        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i8, int i9) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f44405e = c.a(textPaint).setBreakStrategy(i8).setHyphenationFrequency(i9).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f44405e = null;
            }
            this.f44401a = textPaint;
            this.f44402b = textDirectionHeuristic;
            this.f44403c = i8;
            this.f44404d = i9;
        }

        public boolean a(a aVar) {
            int i8 = Build.VERSION.SDK_INT;
            if (this.f44403c != aVar.b() || this.f44404d != aVar.c() || this.f44401a.getTextSize() != aVar.e().getTextSize() || this.f44401a.getTextScaleX() != aVar.e().getTextScaleX() || this.f44401a.getTextSkewX() != aVar.e().getTextSkewX() || this.f44401a.getLetterSpacing() != aVar.e().getLetterSpacing() || !TextUtils.equals(this.f44401a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) || this.f44401a.getFlags() != aVar.e().getFlags()) {
                return false;
            }
            if (i8 >= 24) {
                if (!this.f44401a.getTextLocales().equals(aVar.e().getTextLocales())) {
                    return false;
                }
            } else if (!this.f44401a.getTextLocale().equals(aVar.e().getTextLocale())) {
                return false;
            }
            return this.f44401a.getTypeface() == null ? aVar.e().getTypeface() == null : this.f44401a.getTypeface().equals(aVar.e().getTypeface());
        }

        public int b() {
            return this.f44403c;
        }

        public int c() {
            return this.f44404d;
        }

        public TextDirectionHeuristic d() {
            return this.f44402b;
        }

        public TextPaint e() {
            return this.f44401a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.f44402b == aVar.d();
        }

        public int hashCode() {
            return Build.VERSION.SDK_INT >= 24 ? y0.d.b(Float.valueOf(this.f44401a.getTextSize()), Float.valueOf(this.f44401a.getTextScaleX()), Float.valueOf(this.f44401a.getTextSkewX()), Float.valueOf(this.f44401a.getLetterSpacing()), Integer.valueOf(this.f44401a.getFlags()), this.f44401a.getTextLocales(), this.f44401a.getTypeface(), Boolean.valueOf(this.f44401a.isElegantTextHeight()), this.f44402b, Integer.valueOf(this.f44403c), Integer.valueOf(this.f44404d)) : y0.d.b(Float.valueOf(this.f44401a.getTextSize()), Float.valueOf(this.f44401a.getTextScaleX()), Float.valueOf(this.f44401a.getTextSkewX()), Float.valueOf(this.f44401a.getLetterSpacing()), Integer.valueOf(this.f44401a.getFlags()), this.f44401a.getTextLocale(), this.f44401a.getTypeface(), Boolean.valueOf(this.f44401a.isElegantTextHeight()), this.f44402b, Integer.valueOf(this.f44403c), Integer.valueOf(this.f44404d));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f44401a.getTextSize());
            sb.append(", textScaleX=" + this.f44401a.getTextScaleX());
            sb.append(", textSkewX=" + this.f44401a.getTextSkewX());
            int i8 = Build.VERSION.SDK_INT;
            sb.append(", letterSpacing=" + this.f44401a.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.f44401a.isElegantTextHeight());
            if (i8 >= 24) {
                sb.append(", textLocale=" + this.f44401a.getTextLocales());
            } else {
                sb.append(", textLocale=" + this.f44401a.getTextLocale());
            }
            sb.append(", typeface=" + this.f44401a.getTypeface());
            if (i8 >= 26) {
                sb.append(", variationSettings=" + this.f44401a.getFontVariationSettings());
            }
            sb.append(", textDir=" + this.f44402b);
            sb.append(", breakStrategy=" + this.f44403c);
            sb.append(", hyphenationFrequency=" + this.f44404d);
            sb.append("}");
            return sb.toString();
        }

        public a(PrecomputedText.Params params) {
            this.f44401a = params.getTextPaint();
            this.f44402b = params.getTextDirection();
            this.f44403c = params.getBreakStrategy();
            this.f44404d = params.getHyphenationFrequency();
            this.f44405e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
