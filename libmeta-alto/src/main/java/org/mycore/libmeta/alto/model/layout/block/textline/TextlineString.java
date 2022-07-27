/* 
 * This file is part of *** MyCoRe LibMeta ***
 * See https://github.com/MyCoRe-Org/libmeta/ for details.
 * 
 * MyCoRe LibMeta is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published 
 * by the Free Software Foundation, either version 3 of the License, 
 * or (at your option) any later version.
 *
 * MyCoRe LibMeta is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with MyCoRe LibMeta.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.mycore.libmeta.alto.model.layout.block.textline;

import java.util.List;
import java.util.Vector;

import org.mycore.libmeta.alto._misc.FloatAdapter;
import org.mycore.libmeta.alto._misc.IBoundingBoxBuilder;
import org.mycore.libmeta.alto._misc.IBoundingBoxHolder;
import org.mycore.libmeta.alto.model.styles.FontStyle;
import org.mycore.libmeta.common.BuilderBase;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * A sequence of chars. Strings are separated by white spaces or hyphenation
 * chars.
 */

@XmlAccessorType(XmlAccessType.NONE)
public class TextlineString implements ITextlineContent, IBoundingBoxHolder {
	/** Any alternative for the word. */
	@XmlElement(name = "ALTERNATIVE", namespace = "http://www.loc.gov/standards/alto/ns-v2#", required = false)
	protected List<TextlineStringALTERNATIVE> alternative = new Vector<>();

	@XmlAttribute(name = "ID", required = false)
	@XmlSchemaType(name = "ID")
	protected String ID;

	@XmlAttribute(name = "STYLEREFS", required = false)
	@XmlSchemaType(name = "IDREFS")
	protected String STYLEREFS;

	@XmlAttribute(name = "TAGREFS", required = false)
	@XmlSchemaType(name = "IDREFS")
	protected String TAGREFS;

	@XmlAttribute(name = "HEIGHT", required = false)
	@XmlSchemaType(name = "float")
	@XmlJavaTypeAdapter(FloatAdapter .class)
	protected Float HEIGHT;

	@XmlAttribute(name = "WIDTH", required = false)
	@XmlSchemaType(name = "float")
	@XmlJavaTypeAdapter(FloatAdapter .class)
	protected Float WIDTH;

	@XmlAttribute(name = "HPOS", required = false)
	@XmlSchemaType(name = "float")
	@XmlJavaTypeAdapter(FloatAdapter .class)
	protected Float HPOS;

	@XmlAttribute(name = "VPOS", required = false)
	@XmlSchemaType(name = "float")
	@XmlJavaTypeAdapter(FloatAdapter .class)
	protected Float VPOS;

	@XmlAttribute(name = "CONTENT", required = true)
	protected String CONTENT;

	@XmlAttribute(name = "STYLE", required = false)
	protected FontStyle STYLE;

	/** Type of the substitution (if any). */
	@XmlAttribute(name = "SUBS_TYPE", required = false)
	protected SubstitutionType SUBS_TYPE;

	/** Content of the substitution. */
	@XmlAttribute(name = "SUBS_CONTENT", required = false)
	protected String SUBS_CONTENT;

	/**
	 * Word Confidence: Confidence level of the ocr for this string. A value between
	 * 0 (unsure) and 1 (sure).
	 */
	@XmlAttribute(name = "WC", required = false)
	@XmlSchemaType(name = "float")
	protected Float WC;

	/**
	 * Confidence level of each character in that string. A list of numbers, one
	 * number between 0 (sure) and 9 (unsure) for each character.
	 */
	@XmlAttribute(name = "CC", required = false)
	protected String CC;
	
	@XmlAttribute(name = "CS", required = false)
	@XmlSchemaType(name = "boolean")
	protected Boolean CS;
	
	@XmlAttribute(name = "SUBS_CONTENT", required = false)
	@XmlSchemaType(name = "language")
	protected String LANGUAGE;


	public List<TextlineStringALTERNATIVE> getAlternative() {
		return alternative;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getSTYLEREFS() {
		return STYLEREFS;
	}

	public void setSTYLEREFS(String sTYLEREFS) {
		STYLEREFS = sTYLEREFS;
	}

	public String getTAGREFS() {
		return TAGREFS;
	}

	public void setTAGREFS(String tAGREFS) {
		TAGREFS = tAGREFS;
	}

	public Float getHEIGHT() {
		return HEIGHT;
	}

	public void setHEIGHT(Float hEIGHT) {
		HEIGHT = hEIGHT;
	}

	public Float getWIDTH() {
		return WIDTH;
	}

	public void setWIDTH(Float wIDTH) {
		WIDTH = wIDTH;
	}

	public Float getHPOS() {
		return HPOS;
	}

	public void setHPOS(Float hPOS) {
		HPOS = hPOS;
	}

	public Float getVPOS() {
		return VPOS;
	}

	public void setVPOS(Float vPOS) {
		VPOS = vPOS;
	}

	public String getCONTENT() {
		return CONTENT;
	}

	public void setCONTENT(String cONTENT) {
		CONTENT = cONTENT;
	}

	public FontStyle getSTYLE() {
		return STYLE;
	}

	public void setSTYLE(FontStyle fontStyle) {
		this.STYLE = fontStyle;
	}

	public SubstitutionType getSUBS_TYPE() {
		return SUBS_TYPE;
	}

	public void setSUBS_TYPE(SubstitutionType sUBS_TYPE) {
		SUBS_TYPE = sUBS_TYPE;
	}

	public String getSUBS_CONTENT() {
		return SUBS_CONTENT;
	}

	public void setSUBS_CONTENT(String sUBS_CONTENT) {
		SUBS_CONTENT = sUBS_CONTENT;
	}

	public Float getWC() {
		return WC;
	}

	public void setWC(Float wC) {
		WC = wC;
	}

	public String getCC() {
		return CC;
	}

	public void setCC(String cC) {
		CC = cC;
	}

	public Boolean isCS() {
		return CS;
	}

	public void setCS(Boolean cS) {
		CS = cS;
	}

	public String getLANGUAGE() {
		return LANGUAGE;
	}

	public void setLANGUAGE(String lANGUAGE) {
		LANGUAGE = lANGUAGE;
	}
	
	public static Builder builder() {
		return builder(new TextlineString());
	}

	public static Builder builder(TextlineString text) {
		return new Builder(text);
	}

	public static class Builder extends BuilderBase<TextlineString, Builder>
			implements IBoundingBoxBuilder<TextlineString, Builder> {

		protected Builder(TextlineString sp) {
			super(sp);
		}

		public Builder add(TextlineStringALTERNATIVE alternative) {
			_target().getAlternative().add(alternative);
			return _self();
		}

		public Builder ID(String id) {
			_target().setID(id);
			return _self();
		}

		public Builder STYLEREFS(String stylerefs) {
			_target().setSTYLEREFS(stylerefs);
			return _self();
		}

		public Builder TAGREFS(String tagrefs) {
			_target().setTAGREFS(tagrefs);
			return _self();
		}

		public Builder CONTENT(String content) {
			_target().setCONTENT(content);
			return _self();
		}
		
		public Builder STYLE(FontStyle style) {
			_target().setSTYLE(style);
			return _self();
		}
		
		public Builder SUBS_TYPECONTENT(SubstitutionType substitutionType) {
			_target().setSUBS_TYPE(substitutionType);
			return _self();
		}
		
		public Builder SUBS_CONTENT(String subsContent) {
			_target().setSUBS_CONTENT(subsContent);
			return _self();
		}
		public Builder WC(Float wc) {
			_target().setWC(wc);
			return _self();
		}
		
		public Builder CC(String cc) {
			_target().setCC(cc);
			return _self();
		}
		
		public Builder CS(Boolean cs) {
			_target().setCS(cs);
			return _self();
		}
		
		public Builder LANG(String language) {
			_target().setLANGUAGE(language);
			return _self();
		}
	}

}